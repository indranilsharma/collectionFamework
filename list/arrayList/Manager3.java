package com.CollectionFramework.list.arrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

public class Manager3 {

	public static void main(String[] args) {

		ArrayList<Integer> allist = new ArrayList<Integer>();

		allist.add(9);
		allist.add(5);
		allist.add(90);
		allist.add(29);
		allist.add(2);
		allist.add(null);
		
		System.out.println(allist instanceof Serializable);
		System.out.println(allist instanceof Cloneable);
		System.out.println(allist instanceof RandomAccess);
		
		// use new ArrayList(Collection c)
		List listType = new Vector<Integer>(allist);
		
		listType.add(5);
		listType.add(4);
		listType.add(99);
		
		System.out.println(listType);
		System.out.println(listType instanceof ArrayList);
		System.out.println(listType instanceof Vector);
		System.out.println(listType instanceof List);
		System.out.println("-------");
		
//		list.retainAll(list1);
//		System.out.println(list);
//		System.out.println(list1);

	}
}
