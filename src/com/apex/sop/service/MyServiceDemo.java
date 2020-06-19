/**
 * MyServiceDemo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.sop.service;

public interface MyServiceDemo extends java.rmi.Remote {
    public int add(int a, int b) throws java.rmi.RemoteException;
    public java.lang.String sayHelloToUser(java.lang.String name) throws java.rmi.RemoteException;
    public com.apex.sop.service.vo.Employee getEmployee(int id) throws java.rmi.RemoteException;
    public java.util.Calendar showDate() throws java.rmi.RemoteException;
    public java.lang.String sayHello() throws java.rmi.RemoteException;
}
