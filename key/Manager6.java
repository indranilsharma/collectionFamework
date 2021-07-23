package com.CollectionFramework.key;

import java.util.*;

class F
{
	int i,j;
	F(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "(" +i+ "," +j+ ")";
	}
}
class G implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.i-f2.i;
	}
	
}
class H implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.j-f2.j;
		
	}
}

public class Manager6 {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new F(1,0));
		list.add(new F(2,4));
		list.add(new F(3,6));
		list.add(new F(9,1));
		System.out.println(list);
		Collections.sort(list,new G());
		System.out.println(list);
		Collections.sort(list,new H());
		System.out.println(list);
		
		
		
	}

}
