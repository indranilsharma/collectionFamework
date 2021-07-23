package com.CollectionFramework.employeeApp;

import java.util.*;


class Employee
{
	int empid;
	 String empName;
	double empSal;
	public Employee(int empid, String empName, double empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}
	public String toString()
	{
		return  +empid +"," +empName + "," + empSal;
	}
}
	
	

 class G1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return e1.empid-e2.empid;
	}
}
class H1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return (e1.empName).compareTo(e2.empName);
	}
	
}
class T1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee)o2;
		return (int) (e1.empSal-e2.empSal);
	}
	
}



	

	


public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Employee(11,"gyan",41000));
		list.add(new Employee(3,"sonu",5000));
		list.add(new Employee(12,"aab",43000));
		list.add(new Employee(31,"hmm",55000));
		System.out.println(list);
		System.out.println("-------------");
		Collections.sort(list,new G1());
		System.out.println(list);
		Collections.sort(list,new H1());
		System.out.println(list);
		Collections.sort(list,new T1());
		System.out.println(list);
		
		
		
		
	}
}





