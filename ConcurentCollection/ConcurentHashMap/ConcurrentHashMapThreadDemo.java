package durgaSoftCoreJava.common.ConcurentCollection.ConcurentHashMap;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapThreadDemo extends Thread {

	static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();

	// if we remove concurrent then exception will occurred
	// static HashMap<Integer, String> chm = new HashMap<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("child try to update");
		// No concurrent modification exception will occurred
		chm.put(103, "c");
	}

	public static void main(String[] args) throws InterruptedException {
		chm.put(101, "a");
		chm.put(102, "b");
		chm.put(104, "d");

		ConcurrentHashMapThreadDemo demo = new ConcurrentHashMapThreadDemo();

		demo.start();

		Set<Integer> keySet = chm.keySet();

		Iterator<Integer> iterator = keySet.iterator();
		// child thread updated value there is no guaranty available to iterator
		// or not if that particular cell is already crossed by iterator
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Entry  " + integer + " " + chm.get(integer));
			Thread.sleep(2000);
		}
		System.out.println(chm);

	}

}
