package day20ArraylistEKeskin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		List <Integer> listnum = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        listnum.add(17);
        listnum.add(23);
        listnum.add(11);
        listnum.add(17);
        listnum.add(3);
        listnum.add(5);
        listnum.add(8);
        listnum.add(-5);
        listnum.add(-3);
        
        System.out.println(listnum.isEmpty());
        System.out.println(list2.isEmpty());
        System.out.println(listnum.remove(3));//removing from specific index
        System.out.println(listnum.remove(listnum.indexOf(5)));//removing specific element
        
        
        /*
         * From an integer list find the minimum difference
         */
        List<Integer> list1 = new ArrayList<>();
        list1.add(27);
        list1.add(15);
        list1.add(312);
        list1.add(28);
        list1.add(14);
        list1.add(162);
        list1.add(61);
        list1.add(39);
        list1.add(121);
        list1.add(16);
        list1.add(18);
        Collections.sort(list1);
        List<Integer> listdif = new ArrayList<>();
       
        System.out.println("Sorted list is "+list1);
        for (int i=0; i<list1.size();i++) {
        	for(int k=i+1; k<list1.size();k++) {
        		listdif.add((Math.abs((list1.get(i)-list1.get(k)))));
        		
        	}
        }System.out.println(listdif);
        System.out.println("Min is "+listdif.get(0));
        Collections.sort(listdif);
        System.out.println("Max is "+listdif.get(listdif.size()-1));
        
	}

}
