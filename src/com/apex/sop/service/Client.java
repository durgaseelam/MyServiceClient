package com.apex.sop.service;

import java.rmi.RemoteException;
import java.util.Calendar;

import com.apex.sop.service.vo.Employee;

public class Client {
public static void main(String[] args) throws RemoteException {
	MyServiceDemoProxy proxy=new MyServiceDemoProxy();
	Employee ed=proxy.getEmployee(20);
	Calendar cal=proxy.showDate();
	String str1=proxy.sayHello();
	String str2=proxy.sayHelloToUser(" RAM ");
	int sum=proxy.add(12, 34);
	System.out.println(ed.getSalary());
	System.out.println(cal);
	System.out.println(str1);
	System.out.println(sum);
	System.out.println(str2);
}
}
