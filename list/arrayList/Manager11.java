package com.CollectionFramework.list.arrayList;


import java.util.*;


public class Manager11 {
	 
	public static void main(String[] args) {
		
		 ArrayList list=new ArrayList();
		 list.add(9);
		 list.add(19);
		 list.add(90);
		 list.add(29);
		 list.add(2);
		 list.add(25);
		 System.out.println(list);
		 Comparator ctr=Collections.reverseOrder();
		 Collections.sort(list,ctr);
		 System.out.println(list);
		 
		 
	}
	

}
