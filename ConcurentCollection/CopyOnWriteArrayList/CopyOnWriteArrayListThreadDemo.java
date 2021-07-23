package durgaSoftCoreJava.common.ConcurentCollection.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListThreadDemo extends Thread {

	static CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("child try to update");
        // no concurrent modification exception rised
		cowal.add("C");
	}

	public static void main(String[] args) throws InterruptedException {
		cowal.add("A");
		cowal.add("B");

		CopyOnWriteArrayListThreadDemo demo = new CopyOnWriteArrayListThreadDemo();
		demo.start();

		Iterator<String> itr = cowal.iterator();

		//upate will be or not be available to iterator
		while (itr.hasNext()) {

			String string = (String) itr.next();
			System.out.println("fetching the list " + string);
			Thread.sleep(2000);
		}
		System.out.println(cowal);
	}

}
