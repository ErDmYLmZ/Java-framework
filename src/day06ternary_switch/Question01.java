package day06ternary_switch;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	     System.out.println("Please enter a year to check wether it is leapyear or not..");
	     int year = scan.nextInt();
	     
	     /*
	      * 1- & and && have the similar functionality
	      * 2- & java will check all conditions
	      * 2- && java will not check all conditions if one of them is falls
	      */
	     
	     /*if(year %100 ==0 && year %400 ==0) {
	    	System.out.println( year + " is a leap year"); 
	     } else if (year %100 !=0 && year %4 == 0) {
	    	 System.out.println( year + "is a leap year");
	     } else {
	    	 System.out.println(year + " is not a leap year");
	     }
	
	     */
	     if(year<0) {
	    	 System.out.println("Year must be positive");
	     }
	     
	     else if(year%100==0) {
	    	 if(year%400==400) {
	    		 System.out.println(year + " is leap year");
	    	 }else 
	     {System.out.println(year + " is not a leap year");
	}
	     } else {
	    	 if (year%4==0) {
	    	 System.out.println(year + " is leap year" );
	     } else {
	    	 System.out.println(year + " is not a leap year");}}}}
	     
	
	


	


