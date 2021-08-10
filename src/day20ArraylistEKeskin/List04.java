package day20ArraylistEKeskin;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
	
		
		  List<Integer> list1 = new ArrayList<>();
	        list1.add(3);
	        list1.add(23);
	        list1.add(12);
	        list1.add(11);
	        list1.add(13);
	        list1.add(10);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(25);
	        list2.add(2);
	        list2.add(17);
	        list2.add(18);
	        list2.add(1);
	        list2.add(115);
	        
	        List<Integer> list3 = new ArrayList<>();
	        
		System.out.println("before adding "+list1);
		System.out.println(list1.addAll(list2)); // true
		System.out.println("After adding "+list1);
		
		//adding an empty list into the list1
		System.out.println(list1.addAll(list3));//false
		System.out.println(list3);
		
			List<Integer> list4 = new ArrayList<>();
			list4.add(2);
	        list4.add(121);
	        list4.add(125);
	        
	        // adding list4 into the index 2
		list1.addAll(2, list4);
		System.out.println(list1);
		
			// to delete all the elements from thee list
		
		list1.clear();
		System.out.println(list1);
		
	}

}
