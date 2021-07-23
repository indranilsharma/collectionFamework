package com.CollectionFramework.map;

import java.util.*;

class P
{
	int i;

	public P(int i) {
		super();
		this.i = i;
	}
	@Override
	public String toString() {
		return "i="+i;
	}
}
class Q
{
	int j;

	public Q(int j) {
		super();
		this.j = j;
	}
	@Override
	public String toString() {
		return "j=" +j;
	}
	@Override
	public int hashCode() {
		return Integer.toString(j).hashCode();
	}
}

public class Manager39 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(90, "e1");
		map.put(90, "e2");
		map.put("abc", "v1");
		map.put("abc", "v2");
		map.put(new P(9), "hello1");
		map.put(new P(9), "hello2");
		map.put(new Q(9), "hello3");
		map.put(new Q(9), "hello4");
		map.put(new StringBuffer("abc"), "hello5");
		map.put(new StringBuffer("abc"), "hello6");
		System.out.print(map);
	}

}
