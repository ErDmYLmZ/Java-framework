package day11loops;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		
		//Type code to find the multiplication of the numbers 
		//from 1 to 10
//        int sum=1;
//		for(int i=1; i<11; i++) {
//			sum=sum*i;
//		}
//		System.out.println("The sum of the multiplication is "+sum);
		
		// ask user to enter a number to find its factorial
	    // After 17! we can't have valid results due to data type
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =scan.nextInt();
		int product=1;
		if(num<0) {
			System.err.println("Invalid value for factorial");
		}else {
			for (int i=num; i>0;i--) {
			product= product*i;
		}
			System.out.println("The factorial of "+num+" is: "+ product);
	
		
		}
	
	
	
	}

}
