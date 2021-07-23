package com.CollectionFramework.employeeApp;
import java.util.*;
class EmpSort implements Comparable
{
	int empId;
	String empName;
	

	public EmpSort(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
@Override
public String toString() {
	return empId+ ","+empName;
}

	@Override
	public int compareTo(Object o) {
		return empId-((EmpSort)o).empId;
	}
}

public class EmployeeCom {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new EmpSort(33,"Himadri"));
		al.add(new EmpSort(3,"Gyan"));
		al.add(new EmpSort(42,"Sumit"));
		al.add(new EmpSort(23,"Pandey"));
		System.out.println(al);
		System.out.println("-------------");
		System.out.println("sorting based on EmpId");
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
