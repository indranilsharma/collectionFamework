package com.CollectionFramework.list.arrayList;

import java.util.ArrayList;

class B
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i=" +i;
	}
}

public class Manager4 {
	public static void main(String[] args) {
		
	
	ArrayList list=new ArrayList();
	list.add(new B(90));
	list.add(new B(99));
	list.add(new B(23));
	list.add(new B(45));
	System.out.println(list);
	
	}

}
