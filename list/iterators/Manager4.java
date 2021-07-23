package com.CollectionFramework.list.iterators;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*Randomly permutes the specified list using a default source of
* randomness.  All permutations occur with approximately equal
* likelihood.*/


public class Manager4 {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();

        list.add(new Integer(2));
        list.add(new Integer(8));
        list.add(new Integer(5));
        list.add(new Integer(1));

        Iterator i = list.iterator();

        Collections.reverse(list);
        Collections.shuffle(list);

        while(i.hasNext())

        System.out.print(i.next() + " ");
       
    }
}
