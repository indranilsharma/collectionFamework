package com.CollectionFramework.list.iterators;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*i.next() returns the next element in the iteration. i.remove() removes from 
the underlying collection the last element returned by this iterator (optional operation). 
This method can be called only once per call to next(). The behavior of an iterator is unspecified
if the underlying collection is modified while the iteration is in progress in 
any way other than by calling this method.*/


public class Manager3 {
	public static void main(String args[]) {

		LinkedList list = new LinkedList();

		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));

		Iterator i = list.iterator();

		Collections.reverse(list);
		Collections.shuffle(list);

		i.next();
		i.remove();

		while (i.hasNext())
			System.out.print(i.next() + " ");

	}
}
