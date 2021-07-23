package durgaSoftCoreJava.common.ConcurentCollection.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRemoveDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		cowal.add("D");
		System.out.println(cowal);

		Iterator<String> iterator = cowal.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println("list fetching " + next);
			if (next.equals("C")) {
				//reised java.lang.UnsupportedOperationException remove operation not allowed
				iterator.remove();
			}
		}
		System.out.println(cowal);
	}
}
