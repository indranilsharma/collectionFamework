package com.CollectionFramework.list.vector;

import java.util.Hashtable;

/** The {@code Vector} class implements a growable array of
* objects. Like an array, it contains components that can be
* accessed using an integer index. However, the size of a
* {@code Vector} can grow or shrink as needed to accommodate
* adding and removing items after the {@code Vector} has been created.*/

/*firstly elements 3, 2, 5 are entered in the vector obj, but when obj.removeAll(obj);
is executed all the elements are deleted and vector is empty, hence obj.isEmpty() returns true.
*/

import java.util.Vector;

public class Manager1 {
    public static void main(String args[]) {

        Vector obj = new Vector(4,2);
        obj.addElement(new Integer(3));
        obj.addElement(new Integer(2));
        obj.addElement(new Integer(5));
        obj.removeAll(obj);
        System.out.println(obj.isEmpty());

    }
}
