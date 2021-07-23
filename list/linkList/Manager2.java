package com.CollectionFramework.list.linkList;

import java.util.Iterator;
import java.util.*;



public class Manager2 {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();  //LinkedList<Integer> list = new LinkedList(); 
        list.add(new Integer(2));            //should be paramitarized
        list.add(new Integer(8));
        list.add(new Integer(5));
        list.add(new Integer(1));
        Iterator i = list.iterator();
        Collections.reverse(list);

    while(i.hasNext())
        System.out.print(i.next() + " ");
    }
}
