/**
 * HsdaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.www.bsp;

public class HsdaServiceLocator extends org.apache.axis.client.Service implements com.neusoft.www.bsp.HsdaService {

    public HsdaServiceLocator() {
    }


    public HsdaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HsdaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HsdaServicePort
    private java.lang.String HsdaServicePort_address = "http://10.157.43.129:7091/bspServices1/hsdaService";

    public java.lang.String getHsdaServicePortAddress() {
        return HsdaServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HsdaServicePortWSDDServiceName = "HsdaServicePort";

    public java.lang.String getHsdaServicePortWSDDServiceName() {
        return HsdaServicePortWSDDServiceName;
    }

    public void setHsdaServicePortWSDDServiceName(java.lang.String name) {
        HsdaServicePortWSDDServiceName = name;
    }

    public com.neusoft.www.bsp.HsdaPortType getHsdaServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HsdaServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHsdaServicePort(endpoint);
    }

    public com.neusoft.www.bsp.HsdaPortType getHsdaServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.neusoft.www.bsp.HsdaServiceSoapBindingStub _stub = new com.neusoft.www.bsp.HsdaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHsdaServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHsdaServicePortEndpointAddress(java.lang.String address) {
        HsdaServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.neusoft.www.bsp.HsdaPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.neusoft.www.bsp.HsdaServiceSoapBindingStub _stub = new com.neusoft.www.bsp.HsdaServiceSoapBindingStub(new java.net.URL(HsdaServicePort_address), this);
                _stub.setPortName(getHsdaServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HsdaServicePort".equals(inputPortName)) {
            return getHsdaServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.neusoft.com/bsp", "HsdaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.neusoft.com/bsp", "HsdaServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HsdaServicePort".equals(portName)) {
            setHsdaServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
