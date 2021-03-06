package com.CollectionFramework.map;

import java.util.*;

public class Manager9 {
	public static void main(String[] args) {
		
		HashMap<String, String> aMap = new HashMap<String, String>();
		aMap.put("1", "Monday");
		aMap.put("2", "Tuesday");
		aMap.put("3", "Wednesday");
		System.out.println(aMap);
		System.out.println("--------");

		String str1 = aMap.get("1");  // No need downcast
		System.out.println(str1);
		String str2 = aMap.get("2");
		System.out.println(str2);
		String str3 = aMap.get("3");
		System.out.println(str3);

		Set<String> keys = aMap.keySet();
		for (String str : keys) {
		   System.out.print(str);
		   System.out.print(":");
		   System.out.println(aMap.get(str));
		}
	}

}
