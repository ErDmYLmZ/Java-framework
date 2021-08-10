package PracticeClass_01;

import java.util.Scanner;

public class AbsoluteNumIfElse {

	public static void main(String[] args) {
		/*
	       * Type java code by using if-else statement,
	       * Write a program to print absolute value of a number entered by user.
	       */
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number to get the absolute value of it..");
		int num = scan.nextInt();
		
		if (num>0) {
			System.out.println("The absolute value is " + num);
		}else {
			System.out.println("The absolute value is " + -1*num );
			
			
			
			
			
			
		}
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number to get the absolute value of it..");
		int num = scan.nextInt();
		int result = Math.abs(num);
		
		System.out.println(result);

	}

}
