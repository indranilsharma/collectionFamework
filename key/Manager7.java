package com.CollectionFramework.key;

import java.util.*;

public class Manager7 {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(23);
		list.add(49);
		list.add(15);
		Comparator ctr=Collections.reverseOrder();
		Collections.sort(list,ctr);
		int i=Collections.binarySearch(list, 23);
		System.out.println(list);
		System.out.println(i);
		i=Collections.binarySearch(list,23, ctr);
		System.out.println(i);
		
	}

}
