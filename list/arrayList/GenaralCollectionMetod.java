package com.CollectionFramework.list.arrayList;

import java.util.ArrayList;

public class GenaralCollectionMetod {

	public static void main(String[] args) {
		// constructor type 1 applied
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(00);
		list.add(333);
		list.add(11);
		list.add(333);
		list.add(22);
		list.add(null);
		list.add(33);
		
		// collection method does't contains any method for retrieval
		System.out.println("add() list " + list);
		
		// add number to a specific positions		
		// add(int index, Object o)
		list.add(2, 222);
		System.out.println("add(indext, object o)" + list);
		
		// constructor type 2 applied
		ArrayList list1 = new ArrayList(5);
		list1.add(23);
		list1.add(25);
		list1.add(19);
		list1.add(25);

		//heteogious object are allowed 
		list1.add("india");
		System.out.println("add() list1" + list1);
		
		//addAll(Collection c)
		list.addAll(list1);
		System.out.println("addAll() " + list);
		
		// remove specific object
		list.remove(5);
		System.out.println("remove() " + list);
		
		// remove All specific object
		list.removeAll(list1);
		System.out.println("removeAll() " + list);
		
		//Set value,it will replace old value list 
		list.set(0, 100);
		System.out.println("set() it will override old value " + list);
		
		// it will not override
		list.add(0, 1000);
		System.out.println("add() it will not override old value " + list);
		System.out.println("indexOf() " + list.indexOf(11));
		System.out.println("LastIndextOf() " + list.lastIndexOf(333));

		ArrayList list3 = new ArrayList();
		list3.add(23);
		list3.add(25);
		list3.add("demo");
		list3.add(19);
		System.out.println("list 3 " + list3);
		System.out.println("list 1 " + list1);
		
		//remove all Unmatched element having list1 and list3 same
		// if one set is null then it thorw error 
		list3.retainAll(list1);
		System.out.println("list 1 " + list1);
		System.out.println("list 3 " + list3);
	}

}
