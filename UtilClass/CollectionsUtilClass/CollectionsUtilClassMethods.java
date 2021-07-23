package com.CollectionFramework.UtilClass.CollectionsUtilClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsUtilClassMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Shoes");
		list.add("Toys");

		Collections.addAll(list, "Fruits", "Bat", "Ball", "Panther");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();
		Collections.reverseOrder();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("Bat present in index " + Collections.binarySearch(list, "Bat"));

		List<String> destination_List = new LinkedList<>();
		destination_List.add("Shoes");
		destination_List.add("Toys");
		destination_List.add("Horse");
		destination_List.add("Tiger");
		destination_List.add("Panther");
		destination_List.add("Pendrive");

		System.out.println("copy coming");
		// method of java.util.Collections class is used to copy all the elements from
		// one list into another
		Collections.copy(destination_List, list);
		for (int i = 0; i < destination_List.size(); i++) {
			System.out.print(destination_List.get(i) + " ");
		}
	}
}