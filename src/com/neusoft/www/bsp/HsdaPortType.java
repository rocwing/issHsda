/**
 * HsdaPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.www.bsp;

public interface HsdaPortType extends java.rmi.Remote {
    public java.lang.String get_ValuesByKeys(java.lang.String viewName, java.lang.String[] pmsIds, java.lang.String[] mTypes, java.lang.String flag) throws java.rmi.RemoteException;
    public java.lang.String get_Views() throws java.rmi.RemoteException;
    public java.lang.String scadaCode2PmsNo(java.lang.String codes) throws java.rmi.RemoteException;
    public java.lang.String get_Values(java.lang.String viewName, java.lang.String[] itemIds) throws java.rmi.RemoteException;
    public java.lang.String get_Items(java.lang.String viewName, java.lang.String[] uris) throws java.rmi.RemoteException;
}
