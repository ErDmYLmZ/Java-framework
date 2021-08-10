package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		/*Get a number from user,
		 if the number is less than zero, print "Negative"
		 if the number is greater than zero, print "Positive"
		 if the number equals to zero, print "Neutr"
  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number..");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println(num + " is Negative");	
		}else if (num>0) {
			System.out.println(num+ " is Positive");
			
		}else {
			System.out.println("it is zero");
			
		}
		
		
	}

}
