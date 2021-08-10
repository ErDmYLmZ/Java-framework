package day17arrays;

import java.util.Arrays;

public class Array02EKeskin {

	public static void main(String[] args) {
		
		String eray[] = new String[5];
		
		eray[0]="Bahar";
		eray[1]="Halil";
		eray[2]="Nur";
		eray[3]="Selen";
		eray[4]="Zeki";
		System.out.println(Arrays.toString(eray));

		//print all elements one by one
//		//1.way
//		System.out.println(eray[0]);
//		System.out.println(eray[1]);
//		System.out.println(eray[2]);
//		System.out.println(eray[3]);
//		System.out.println(eray[4]);
		
		//2.way
//		for(int i=0; i<eray.length;i++) {
//			System.out.println(eray[i]);
			
			
			/*
            1)Create a double array whose length is 6
            2)Type a program to add all elements inside the array
            3)Print the sum on the console.
        */
			
			double a[] = {12.1 , 11.0 , 13.5 , 11.2 , 2,4 , 4.1};
			
			double sum=0;
			for (int j=0;j<a.length; j++) {
				sum=sum+a[j];
			}
			System.out.println(sum);
		}
		
	}


