package durgaSoftCoreJava.common.ConcurentCollection.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	
	public static void main(String[] args) {
		CopyOnWriteArraySet arraySet = new CopyOnWriteArraySet();
		arraySet.add("A");
		arraySet.add("B");
		arraySet.add("C");
		arraySet.add("D");
		arraySet.add(null);
		arraySet.add(10);
		
		//duplicate not allowed   
		arraySet.add("D");
		System.out.println(arraySet);
	}
	

}
