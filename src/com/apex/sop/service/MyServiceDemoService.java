/**
 * MyServiceDemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.sop.service;

public interface MyServiceDemoService extends javax.xml.rpc.Service {
    public java.lang.String getMyServiceDemoAddress();

    public com.apex.sop.service.MyServiceDemo getMyServiceDemo() throws javax.xml.rpc.ServiceException;

    public com.apex.sop.service.MyServiceDemo getMyServiceDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
