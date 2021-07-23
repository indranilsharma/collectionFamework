package com.CollectionFramework.employeeApp;

import java.util.*;

class Employee11
{
	int empId;
	String empName;
	double empSal;
	public Employee11(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return empId+ "," +empName+ "," +empSal;
	}
	
}
class A6 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee11 e1=(Employee11) o1;
		Employee11 e2=(Employee11)o2;
		return e1.empId-e2.empId;
	}
	
}
class B6 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee11 e1=(Employee11) o1;
		Employee11 e2=(Employee11) o2;
		return e1.empName.compareTo(e2.empName);
	}
	
}
class C6 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee11 e1=(Employee11) o1;
		Employee11 e2=(Employee11) o2;
		return (int) (e1.empSal-e2.empSal);
	}
	
}

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Employee11(1,"Gyan",5000));
		al.add(new Employee11(12,"Shankha",19000));
		al.add(new Employee11(8,"Pandey",4000));
		al.add(new Employee11(23,"Amit",77000));
		System.out.println(al);
		System.err.println("-------------");
		System.out.println("Sorting according to empId");
		Collections.sort(al,new A6());
		System.out.println(al);
		System.out.println("----------");
		System.out.println("Sorting according to empName");
		Collections.sort(al,new B6());
		System.out.println(al);
		System.out.println("------------");
		System.out.println("sorting according to empSal");
		Collections.sort(al,new C6());
		System.out.println(al);
		
		
	}



}
