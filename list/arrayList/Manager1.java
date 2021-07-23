package com.CollectionFramework.list.arrayList;

/*
This class contains various methods for manipulating arrays (such as
		 * sorting and searching). This class also contains a static factory
		 * that allows arrays to be viewed as lists.*/

/*array was containing 5,4,3,2,1 but when method Arrays.fill(array, 1, 4, 8)
is called it fills the index location starting with 1 to 4 by value 8 hence array becomes 5,8,8,8,1.
*/


/*public static void fill(int[] a, int fromIndex, int toIndex, int val) {
    rangeCheck(a.length, fromIndex, toIndex);
    for (int i = fromIndex; i < toIndex; i++)
        a[i] = val;
}*/


import java.util.Arrays;

public class Manager1 {
	public static void main(String args[]) {

		int array[] = new int[5];

		for (int i = 5; i > 0; i--)

			array[5 - i] = i;

		Arrays.fill(array, 1, 4, 8);

		for (int i = 0; i < 5; i++)

			System.out.print(array[i]);

	}
}
