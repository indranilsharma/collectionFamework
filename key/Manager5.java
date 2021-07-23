package com.CollectionFramework.key;

import java.util.*;


class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i=" +i;
	}
	public int compareTo(Object obj)
	{
		return i-((A)obj).i;
	}
}

public class Manager5 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new A(88));
		list.add(new A(77));
		list.add(new A(72));
		list.add(new A(32));
		list.add(new A(47));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
