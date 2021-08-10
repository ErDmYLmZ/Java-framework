package day03increament_decrement_operations;

import java.util.Scanner;

public class ModulusOperation01 {

	public static void main(String[] args) {
	
		
	/*
	 Modulus Operator (%)is used to find remainder when dividing a number
     
     20/5=4
     
     20%5=0 (this is the (%) modulus symbol and modulus operation

	 */
		
		// Get a number from and print the last digit of that number on the console
		
		/*Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter a number ");
		
		int digit = scanner.nextInt();
		
		System.out.println("The last digit is "+ digit%10);
        
		// or int lastDigit = digit %10;
		// syso (lastDigit);
		*/
		
		Scanner scanne = new Scanner (System.in);
		System.out.print("Enter a 3 digit number please ");
		
		int number = scanne.nextInt();
		
		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle =0;
		
		lastDigit = number%10;
		firstDigit = number/100;
		middle = number/10;
		midDigit = middle%10;
		
		
		System.out.println("Sum of the all digits is " + (firstDigit + midDigit + lastDigit));
		
	}

}
