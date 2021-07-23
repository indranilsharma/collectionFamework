package com.CollectionFramework.list.linkList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*Collections.sort(list) sorts the given list, 
the list was 2->8->5->1 after sorting it became 1->2->5->8.
*/

public class Manager3 {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		Iterator i = list.iterator();

		Collections.reverse(list);
		Collections.sort(list);

		while (i.hasNext())
			System.out.print(i.next() + " ");
	}
}
