package day32collections;

import java.util.HashSet;

public class Hashset01 {

	public static void main(String[] args) {
		/*
		 * Hashing is a technical system to create unique codes for unique elements
		 * 1-)HashSet
		 * 2-)LinkedHashSet
		 * 3-)TreeSet
		 * 
		 * we can store just one null value
		 */
		
		HashSet<String>hset1 = new HashSet<>();
		hset1.add("Blue");
		hset1.add("Orange");
		hset1.add("Turquoise");
		hset1.add("Pink");
		hset1.add("Green");
		
		
		
		System.out.println(hset1);
		
		/*
		 * 1-)hashSet does not care the order. it puts randomly
		 * that is why it works faster
		 */
		
		hset1.add("Pink");
		System.out.println(hset1);
		
		/*
		 * 2-) if you try to add an element twice, the second one will overwrite it.
		 */
		
		hset1.add(null);
		System.out.println(hset1);
		hset1.add(null);
		System.out.println(hset1);
		/*
		 * 3-) we can put just one null value
		 * 
		 * 4-) if you need a collection for the given reasons, use hashSet
		 *   a)unique elements
		 *   b)if order is not important
		 *   c)if it accepts null
		 *   d) if the speed  is important
		 */
		
		
		
	
				
		

	}

}