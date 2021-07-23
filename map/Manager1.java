package com.CollectionFramework.map;

import java.util.Hashtable;

public class Manager1 {
    public static void main(String args[]) {

        Hashtable obj = new Hashtable();
        obj.put("A", new Integer(3));
        obj.put("B", new Integer(2));
        obj.put("C", new Integer(8));
        obj.remove(new String("A"));
        System.out.print(obj);
    }
}
