package day13loops;

import java.util.Scanner;

public class DoWhileLoop05 {

	public static void main(String[] args) {
//		Ask user to enter an integer.
//		 If the integer is divisible by 5, tell user to "Won"
//		 Otherwise tell user "Lost" and ask user if s/he wants to play again.
//		 if yes ask a new number to enter, if no say Thanks.

		
		Scanner scan =new Scanner(System.in);
		int num = 0;
		
		do { 
			System.out.println("Enter an integer");
			num = scan.nextInt();
			if(num%5==0) {
				System.out.println("You Won!!");
			}else {
				System.out.println("You Lost!!");
			}
			System.out.println("To end the game, press NO (N) to continue press any key");	
				char answer=scan.next().toUpperCase().charAt(0);
				if(answer=='N') {
					break;
				}
		}while(true);
			
		System.out.println("Thank you");
			
	}
//Screen Shot 2021-06-22 at 9.33.08 PM
}
