package day05_ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
		/*
	 	Ask user to enter an integer
	 	If the integer is less than zero check if it is less than -9. If it is less than -9 print "Too small" otherwise print "Small"
	 	If the integer is greater than zero check if it is greater than 9. If it is gretaer than 9 print "Too big" otherwise print "Big"
	 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int num = scan.nextInt();
		
		if(num<0) {
			if(num<-9 ) {
				System.out.println("Too Small");
				} else {
					System.out.println("Small");
				}
		}else if (num>0) {
			if(num>9) {
				System.out.println("Too Big");
			}else 
			{System.out.println("Big");
			
	}

		} scan.close();
	}
       }
