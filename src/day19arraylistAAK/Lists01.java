package day19arraylistAAK;

import java.util.ArrayList;
import java.util.Collections;

public class Lists01 {

	public static void main(String[] args) {
		
		// ArrayLists are flexible with their size
		// ArrayLists cannot store multiple data type
		// ArrayLists store non primitive data type
		
		
		//How to create a list
		//1. way
		ArrayList<Integer> list = new ArrayList<>(); 
		// to print the list on the console : just place the name of the list in the System.out.println()
		
		System.out.println(list); //[]
		
		//How to add elements into a list
		
		list.add(12);
		list.add(5);
		list.add(30);
		list.add(0, 8);
		
		System.out.println(list); // [8, 12, 5, 30]
		
		Collections.sort(list); // we use collections to sort in ascending order
		
		 //How to sort ArrayList ascending order
	    Collections.sort(list);
	    System.out.println("after sorting:"+list);
	    
	    //How to sort an arraylist in descending order
	    
	    Collections.sort(list,Collections.reverseOrder());
	    System.out.println("sorting in descending order: "+list);
	    
		
		
		System.out.println(list);//[5, 8, 12, 30]
		
		//How to sort in a descending order
		Collections.sort(list, Collections.reverseOrder());
		
		//how to get a specific element form list
		System.out.println(list.get(2));
		//System.out.println(list.get(4)); //IndexOutOfBoundsException bc there is no index 4 
		
		list.add(25);
		list.add(45);
		list.add(19);
		list.add(-5);
		list.add(128);
		list.add(501);
		list.add(-17);
		
		System.out.println(list);
		
		/*
		 type a code to find and print the min and max elements form list
		 
		 */
		Collections.sort(list);
		System.out.println(list);//[-5, 5, 8, 12, 19, 25, 30, 45, 128]
		int min = list.get(0);
		int max = list.get(list.size()-1);
		System.out.println("min value is "+ min +"======" + "max value is " + max);
		
		// how to check if the list is empty or not
		System.out.println(list.isEmpty()); // false
		
		ArrayList<String> list2 = new ArrayList<>(); 
		
		System.out.println(list2.isEmpty()); //true
		
		
		//how remove elements form a list
		//by index
//		list.remove(5); //index the index of the element to be removed
		System.out.println(list.remove(5)); //the element that was removed from the list
		System.out.println(list);
		
		
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
		
		System.out.println(list2); //[Ali, Veli, John, Ayse, Can]
		
		list2.remove(list2.remove("Ali"));
		
		System.out.println(list2);
		
		
	}
}