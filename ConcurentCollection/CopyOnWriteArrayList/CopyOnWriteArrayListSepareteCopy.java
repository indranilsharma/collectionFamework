package durgaSoftCoreJava.common.ConcurentCollection.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListSepareteCopy {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println("before  add new content :" + string);
			list.add("D");
			System.out.println("before  add new content :" + string);

		}
		System.out.println("In the iterator update copy not avalable and no rised concurent modification exception");
	}
}
