package day11loops;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		
	    //Ask user to enter the number of rows and the number columns then		 	
		//draw rectangle by using *			 	
		//Example: row = 3, column=4		 	         
//		  * * * *		 	         
//		  * * * *		 	        
//		  * * * *
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the # of rows");
		int row =scan.nextInt();
		System.out.println("Enter the # of columns");
		int col =scan.nextInt();
		
		
		for(int i = 1; i<row+1; i++) {
			for(int j=1; j<col+1;j++) {
				System.out.print("* ");
			}
				System.out.println();
		}
		
}
	

	
	}

