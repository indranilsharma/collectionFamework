package durgaSoftCoreJava.common.ConcurentCollection.ConcurentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(101, "A");
		chm.put(102, "B");
		System.out.println(chm+"\n");

		//no effect because key is available
		chm.putIfAbsent(101, "D");
		System.out.println(chm+"\n");

		//add to map
		chm.putIfAbsent(103, "C");
		System.out.println(chm+"\n");

		//no effect because value not matched 
		chm.remove(101, "D");
		System.out.println(chm+"\n");

		//key and value both matched
		chm.replace(102, "B", "K");
		System.out.println(chm);

	}
}
