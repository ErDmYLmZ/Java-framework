package PracticeClass_01;

import java.util.Scanner;

public class NumberOfMinutes {

	public static void main(String[] args) {
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the minutes to convert to years and days...");
		long min = scan.nextLong();
		long year = min/(60*24*365);
		long day = (min/60/24)%365;
		System.out.println("The conversion result is "+ min+" minutes " +"equals to "+ year +" years and " + day + " days.");
		
		
		
		
		
	}

}
