package com.apex.sop.service;

public class MyServiceDemoProxy implements com.apex.sop.service.MyServiceDemo {
  private String _endpoint = null;
  private com.apex.sop.service.MyServiceDemo myServiceDemo = null;
  
  public MyServiceDemoProxy() {
    _initMyServiceDemoProxy();
  }
  
  public MyServiceDemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyServiceDemoProxy();
  }
  
  private void _initMyServiceDemoProxy() {
    try {
      myServiceDemo = (new com.apex.sop.service.MyServiceDemoServiceLocator()).getMyServiceDemo();
      if (myServiceDemo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myServiceDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myServiceDemo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myServiceDemo != null)
      ((javax.xml.rpc.Stub)myServiceDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.apex.sop.service.MyServiceDemo getMyServiceDemo() {
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo.add(a, b);
  }
  
  public java.lang.String sayHelloToUser(java.lang.String name) throws java.rmi.RemoteException{
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo.sayHelloToUser(name);
  }
  
  public com.apex.sop.service.vo.Employee getEmployee(int id) throws java.rmi.RemoteException{
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo.getEmployee(id);
  }
  
  public java.util.Calendar showDate() throws java.rmi.RemoteException{
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo.showDate();
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (myServiceDemo == null)
      _initMyServiceDemoProxy();
    return myServiceDemo.sayHello();
  }
  
  
}