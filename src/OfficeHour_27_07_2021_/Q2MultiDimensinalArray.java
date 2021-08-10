package OfficeHour_27_07_2021_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2MultiDimensinalArray {
		   /*write a return method that accepts an Multidimensional Array as input
	        * Puts all element in a new list
	        * and prints all elements in natural order
	        *
	        * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
	        *  Output:[Ali, Brad, Fox, John, Lee, Suzan]
	        */     

	public static void main(String[] args) {
		
			String arr1[][]={{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
			
			
		naturalOrder(arr1);	
			
	}
	
	public static List<String> naturalOrder(String arr1[][] ){
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j< arr1[i].length; j++) {
				list.add(arr1[i][j]);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);
		
		
		return list;
		
	}
	
	
	
	
	
}
