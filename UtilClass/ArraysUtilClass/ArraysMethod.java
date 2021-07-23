package com.CollectionFramework.UtilClass.ArraysUtilClass;

import java.util.Arrays;

public class ArraysMethod {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35 };

		// two dimensional required for arrays
		int intArr1[][] = { { 10, 20, 15, 22, 35 } };
		int intArr2[][] = { { 10, 22, 15, 22, 35 } };

		// return fixed size list
		System.out.println(Arrays.asList(intArr));

		// need to short first
		Arrays.sort(intArr);
		int key = 20;

		// then apply binarySearch method
		System.out.println("found index at " + Arrays.binarySearch(intArr, key));

		// This method copies the specified array, truncating or padding with the
		// default value
		// add 5 extra positions
		System.out.println(Arrays.toString(Arrays.copyOf(intArr, 10)));

		// This method copies the specified range of the specified array into a new
		// Arrays.
		System.out.println(Arrays.toString(Arrays.copyOfRange(intArr, 1, 4)));
        
		//This method returns true if the two specified arrays are deeply equal to one another.
		System.out.println(
				"Integer Arrays on comparison:  " + Arrays.deepEquals(intArr1, intArr2) 
				 + " deepHashCode of intArr1 " + Arrays.deepHashCode(intArr1) 
				  + " deepHashCode of intArr2 " + Arrays.deepHashCode(intArr1));
		
		System.out.println(" Arrays on comparison: "+Arrays.equals(intArr1, intArr2));
        
		//This method assigns this fillValue to each index of this Arrays.
		Arrays.fill(intArr, 20);
		System.out.println(" Array on filling:" + Arrays.toString(intArr));
		
		//This method returns a sequential stream with the specified array as its source.
		System.out.println(Arrays.stream(intArr));
	}
}
