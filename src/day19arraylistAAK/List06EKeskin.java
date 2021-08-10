package day19arraylistAAK;

import java.util.ArrayList;

public class List06EKeskin {

	public static void main(String[] args) {
		/*
		 * Please create an integer Arraylist
		 * add number : 3,45,12,3,6,45,7,8
		 * print your list
		 * remove the repeated elements from your list
		 * please print the unique list
		 */

		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(3);
		list1.add(45);
		list1.add(12);
		list1.add(3);
		list1.add(6);
		list1.add(45);
		list1.add(7);
		list1.add(8);
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (int i = 0 ; i<list1.size();i++) {
			if (!list2.contains(list1.get(i))) {
				list2.add(list1.get(i));
			}
		}System.out.println(list2);
		
	}

}
