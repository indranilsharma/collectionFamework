package com.CollectionFramework.UtilClass.ArraysUtilClass;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;

class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
//		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
}

class Sortbyroll implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

public class ComparatorApp {
	public static void main(String[] args) {
		Student[] arr = { new Student(111, "bbbb", "london"), new Student(131, "aaaa", "nyc"),
				new Student(121, "cccc", "jaipur") };

		System.out.println("Unsorted");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Arrays.sort(arr, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
