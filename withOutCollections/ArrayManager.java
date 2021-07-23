package com.CollectionFramework.withOutCollections;

import java.util.Arrays;
import java.util.Collections;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Customer {
	int id;
	String name;

	Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class ArrayManager {

	public static void main(String[] args) {
// so many number of variable required so we should go for collections API
		int x = 0;
		int y = 10;
// fixed in nature
		Student myArry[] = new Student[100];
		System.out.println(myArry.length);
		myArry[0] = new Student(01, "Ronny");
		myArry[1] = new Student(02, "Jack");

		Collections.max(null);
		Arrays.asList(null);

// only hold homoginous elemnts
//		 myArry[3] = new Customer();

// we can heal this by declare objct type
		Object myObjArry[] = new Object[5];
		myObjArry[0] = new Student(03, "Zidan");
		myObjArry[1] = new Customer(06, "Baby");

/* memory size are waste bcz its fixed
no underlying data stucture availble
 no ready made method not present for extract*/
		
		for (int i = 0; i < myObjArry.length; i++) {
			System.out.println(myObjArry[0]);
		}
		// System.out.println(myObjArry);
	}
}
