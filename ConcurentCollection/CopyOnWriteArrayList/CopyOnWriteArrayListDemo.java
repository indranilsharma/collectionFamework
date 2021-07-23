package durgaSoftCoreJava.common.ConcurentCollection.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
		cowal.add(20);
		cowal.add(20);
		System.out.println(cowal);

		cowal.addIfAbsent(50);
		System.out.println(cowal);

		//if normal collection it will add [20,20,50,50] 
		cowal.addIfAbsent(50);
		System.out.println(cowal);
	}
}
