package practiceClass_02;

import java.util.Scanner;

public class MoreThanTenDigits {

	public static void main(String[] args) {
//		Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
//		If given integers or the sum have more than 10 digits, print "overflow".
//		EXAMPLE:
//		INPUT :
//		Input two integers:
//		25
//		46
//		OUTPUT :
//		Sum of the numbers: 71

		Scanner scan=new Scanner(System.in);
		//System.out.println("Please enter a String..");
		long fn = scan.nextLong();
		long sn = scan.nextLong();
		long sum= fn+sn;
		if(fn>999999999 ||sn>999999999) {
			System.out.println("overflow");
		}if(sum>999999999) {
			System.out.println("overflow");
		}else {
		System.out.println("Sum of the numbers: "+sum);
	}
		}

}
