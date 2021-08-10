package practiceClass_02;

import java.util.Scanner;

public class DivisibleFiveNumbers {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 or divisible by 5
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a Number..");
		int num = scan.nextInt();
		
		System.out.println(num%5==0 ? num+" is divisible by 5" : num+ " is not divisible by 5");
	}

}
