package com.CollectionFramework.list.iterators;

import java.util.*;

public class Manager5 {

	public static void main(String args[]) {
		// List list=new LinkList();
		LinkedList list = new LinkedList();

		list.add(new Integer(2));
		list.add(new Integer(8));

		ListIterator a = list.listIterator();

		if (a.previousIndex() != -1)
			while (a.hasNext())
				System.out.print(a.next() + " ");
		else
			System.out.print("EMPTY");

	}
}
