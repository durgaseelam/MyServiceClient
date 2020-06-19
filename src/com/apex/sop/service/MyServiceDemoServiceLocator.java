/**
 * MyServiceDemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.sop.service;

public class MyServiceDemoServiceLocator extends org.apache.axis.client.Service implements com.apex.sop.service.MyServiceDemoService {

    public MyServiceDemoServiceLocator() {
    }


    public MyServiceDemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyServiceDemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyServiceDemo
    private java.lang.String MyServiceDemo_address = "http://localhost:8081/userservice/services/MyServiceDemo";

    public java.lang.String getMyServiceDemoAddress() {
        return MyServiceDemo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyServiceDemoWSDDServiceName = "MyServiceDemo";

    public java.lang.String getMyServiceDemoWSDDServiceName() {
        return MyServiceDemoWSDDServiceName;
    }

    public void setMyServiceDemoWSDDServiceName(java.lang.String name) {
        MyServiceDemoWSDDServiceName = name;
    }

    public com.apex.sop.service.MyServiceDemo getMyServiceDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyServiceDemo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyServiceDemo(endpoint);
    }

    public com.apex.sop.service.MyServiceDemo getMyServiceDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.apex.sop.service.MyServiceDemoSoapBindingStub _stub = new com.apex.sop.service.MyServiceDemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyServiceDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyServiceDemoEndpointAddress(java.lang.String address) {
        MyServiceDemo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.apex.sop.service.MyServiceDemo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.apex.sop.service.MyServiceDemoSoapBindingStub _stub = new com.apex.sop.service.MyServiceDemoSoapBindingStub(new java.net.URL(MyServiceDemo_address), this);
                _stub.setPortName(getMyServiceDemoWSDDServiceName());
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
        if ("MyServiceDemo".equals(inputPortName)) {
            return getMyServiceDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.sop.apex.com", "MyServiceDemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.sop.apex.com", "MyServiceDemo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyServiceDemo".equals(portName)) {
            setMyServiceDemoEndpointAddress(address);
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
