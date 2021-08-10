package day13loops;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		     Ask user to enter an integer
		     If the integer is even print on the console "You won!"
			 Otherwise ask user to enter another integer
         */
	Scanner scan = new Scanner(System.in);
	int num = 0;
	
	
	do{
		System.out.println("Please enter a number to play.. ");
		
		num = scan.nextInt();
		if(num%2!=0) { System.out.println("You Lost!!!.. ");
			} 
		
	
	}while(num%2!=0);
	
	System.out.println("****You Won!!!****");
	}

}

