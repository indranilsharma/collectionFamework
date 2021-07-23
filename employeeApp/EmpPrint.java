package com.CollectionFramework.employeeApp;

import java.util.*;


public class EmpPrint {
	int empId;
	String name;
	
	
	public EmpPrint(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		
		return empId + name;
	}

	public static void main(String[] args) {
		ArrayList<EmpPrint> list=new ArrayList<EmpPrint>();
		list.add(new EmpPrint(2,"gyan"));
		list.add(new EmpPrint(22,"pandey"));
		list.add(new EmpPrint(10,"sumit"));
		list.add(new EmpPrint(14,"khanki"));
		for(EmpPrint obj:list)
		{
			System.out.println(obj +":");
		}
	}

}
