package durgaSoftCoreJava.common.ConcurentCollection.ConcurentHashMap;

import java.util.ArrayList;
import java.util.Iterator;


public class CocurrentModificationExceptionDemo extends Thread {

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("child try to update");
		// child thread try to modifying it
		list.add(20);
	}

	public static void main(String[] args) throws InterruptedException {

		list.add(50);
		list.add(100);
		list.add(120);

		CocurrentModificationExceptionDemo t = new CocurrentModificationExceptionDemo();
		t.start();

		Iterator<Integer> iterator = list.iterator();
		// main thread iterating while list
		while (iterator.hasNext()) {

			Integer temp = iterator.next();

			System.out.println("i am from main and object is " + temp);
			Thread.sleep(2000);
		}
		System.out.println("done");

	}
}
