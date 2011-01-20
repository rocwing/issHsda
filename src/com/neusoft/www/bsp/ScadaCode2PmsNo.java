package com.neusoft.www.bsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class ScadaCode2PmsNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			File file = new File(args[0]);
			FileInputStream fis = new FileInputStream(file);
			   XMLInputFactory xif = XMLInputFactory.newInstance();
			   
			   XMLStreamReader reader = xif.createXMLStreamReader(fis);
			    
			   StAXOMBuilder builder = new StAXOMBuilder(reader);
			   OMElement dataSet = builder.getDocumentElement();
			   XMLOutputFactory xof = XMLOutputFactory.newInstance();
			   
			   StringWriter stringWriter = new StringWriter();
			   XMLStreamWriter writer = xof.createXMLStreamWriter(stringWriter);
			   
			   
			   dataSet.serialize(stringWriter);	   	    
			   writer.flush();
			   writer.close();
			   String scadaCode = new String(stringWriter.toString());
			  
			   scadaCode = "<?xml version=\"1.0\" encoding=\"GBK\" ?>"+"\n"+scadaCode;
				//System.out.println(scadaCode);
			
			HsdaService service = new HsdaServiceLocator();
			HsdaPortType hsda = service.getHsdaServicePort();
			String pmsNo = hsda.scadaCode2PmsNo(scadaCode);
				
			
				
				StringReader stringReader = new StringReader(pmsNo);
				
				SAXReader saxReader = new SAXReader();
				Document doc = saxReader.read(stringReader);
				OutputFormat format = OutputFormat.createPrettyPrint();
				XMLWriter xmlWriter = new XMLWriter(new FileWriter(args[1]),format);
				xmlWriter.write(doc);
				xmlWriter.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
