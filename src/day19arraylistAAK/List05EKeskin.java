package day19arraylistAAK;

import java.util.ArrayList;
import java.util.Scanner;

public class List05EKeskin {

	public static void main(String[] args) {
		
    ArrayList<Character>list1 = new ArrayList<>();

    	list1.add('B');
    	list1.add('A');
    	list1.add('E');
    	list1.add('S');
    	list1.add('F');
    	
    	System.out.println(list1);
    	
    	ArrayList<Character>list2 = new ArrayList<>();
    	
    	list2.add('B');
    	list2.add('A');
    	list2.add('E');
    	list2.add('S');
    	list2.add('F');
    	
    	System.out.println(list1.equals(list2));
    	
//		System.out.println(list1.contains('A'));
    	
//    	Ask user to enter a letter
//        If the letter exist in list1 convert it to "$"
//        otherwise add the element which user entered to the list1

    	ArrayList<Character>list3 = new ArrayList<>();
    	list3.add('B');
    	list3.add('A');
    	list3.add('E');
    	list3.add('S');
    	list3.add('F');
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter a letter..");
    	char ch = scan.next().toUpperCase().charAt(0);
    	
    	if(list3.contains(ch)) {
    		list3.set(list3.indexOf(ch), '$');
    		System.out.println(list3);
    	}else {
    		list3.add(ch);
    		System.out.println(list3);
    	}scan.close();
	}
}
