package com.CollectionFramework.list.vector.stack;

import java.util.Stack;

/*The <code>Stack</code> class represents a last-in-first-out
* (LIFO) stack of objects. It extends class <tt>Vector</tt> with five
* operations that allow a vector to be treated as a stack. The usual
* <tt>push</tt> and <tt>pop</tt> operations are provided, as well as a
* method to <tt>peek</tt> at the top item on the stack, a method to test
* for whether the stack is <tt>empty</tt>, and a method to <tt>search</tt>
* the stack for an item and discover how far it is from the top.*/

/*push() and pop() are standard functions of the class stack, push() inserts in the stack
and pop removes from the stack. 3 & 2 are inserted using push() the pop() is used which
removes 2 from the stack then again push is used to insert 5 hence stack contains elements 3 & 5.
*/

public class Manager1 {
    public static void main(String args[]) {

        Stack obj = new Stack();

        obj.push(new Integer(3));

        obj.push(new Integer(2));

        obj.pop();

        obj.push(new Integer(5));

 	    System.out.println(obj);

    }
}
