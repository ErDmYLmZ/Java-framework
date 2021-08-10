package PracticeClass_01;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		/*
	     * A company decided to give bonus of 5% to employee if his/her year of service is more than or equal 5 years.
	     * Ask user for their salary and year of service and print the net bonus amount.
	     * Example: Input= 4 year service
	     *               salary: 4000
	     *          Output= 0
	     */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your salary :");
		int salary = scan.nextInt();
		
		System.out.println("Please enter your service years : ");
		int year = scan.nextInt();
		
		if (year>=5) {
			System.out.println("Your bonus is " + salary*5/100+ "$");
		}else {
			System.out.println("You need " + (5-year) + " year to get bonus ");
		}
		
		
		
		}

}
