package day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1.way
		 * if you want to create a unique and ordered you can use treeset
		 * but it is too slow
		 */
		
		
		TreeSet<String>tset1 = new TreeSet<>();
		tset1.add("Tulip");
		tset1.add("Rose");
		tset1.add("Iris");
		tset1.add("Lily");
		tset1.add("Daisy");
		
		System.out.println(tset1);
		
		/*
		 * 2. way store your data in a hashSet and then convert it to the TreeSet
		 */
		

		HashSet<String> hset1 = new HashSet<>();
		hset1.add("Blue");
		hset1.add("Orange");
		hset1.add("Turquoise");
		hset1.add("Pink");
		hset1.add("Green");
		hset1.add("Purple");

		System.out.println(hset1);
		
		TreeSet<String>tset2 = new TreeSet<>(hset1);
		System.out.println(tset2);

	}

}