package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
