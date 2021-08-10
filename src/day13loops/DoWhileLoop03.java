package day13loops;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
//		Ask user to enter his/her first name
//		 If the initial is lower case print a message like "Make the initial upper case"
//		 If the initial is upper case print a message like "You did it right"

		Scanner scan = new Scanner(System.in);
		char initial ='*';
		
		do {
			System.out.println("Please enter your first name with uppercase initial");
			
			
			initial = scan.next().charAt(0);
			if(initial>='a' && initial <='z') {
				System.out.println("Make the initial uppercase you idiot!!.");
			    System.out.println();
			}
		}while(initial>='a' && initial <='z');
		System.out.println("You did it right");
		}
	}


