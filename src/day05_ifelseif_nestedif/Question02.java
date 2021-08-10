package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a 4 digit integer, then print the sum of the first
		and the last digits of the number on the console.
		For example; if user enters 1234 you will add 1 and 4, then print on the console 5
	*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a four digit number");
		int num = scan.nextInt();
		
		num = Math.abs(num);
		
		if (num>999 && num<10000 ) {
			
			int fDigit = num/1000; // 1234/1000 = 1.234 ==> int ==> 1
			int lDigit = num%10;  // 1234 ==> 4
			System.out.println("The sum of the didgits is " + (fDigit + lDigit));
		} else {
			System.out.println( "Please provide four digit number");
		}

	}

}
