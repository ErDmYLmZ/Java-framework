package officeHours11072021;

import java.util.Scanner;

public class P01SumOfIntMethod {
//int num=0;
	public static void main(String[] args) {
		
//1. Write a method that returns the sum of numbers starting 
//		with 1 to the number passed into the method.
		
		add();
		
	}

	
	public static void add() {
		int sum=0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter an int..");
		 int num = scan.nextInt();
		 for(int i=1; i<=num; i++) {
			 sum = sum+i;
		 }
		 System.out.println("Sum of numbers are : "+sum);
			scan.close(); 
		 
		 
	}
}
