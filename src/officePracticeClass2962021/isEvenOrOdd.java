package officePracticeClass2962021;

import java.util.Scanner;

public class isEvenOrOdd {

	public static void main(String[] args) {
		evenorodd();
		
	  
		
	}
	
	public static void evenorodd () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
	   int num = scan.nextInt();
	   System.out.println(num%2==0 ? "Number is even" : "Number is odd");
//		if(num%2==0) {
//			System.out.println("Number is even");
//		}else {
//			System.out.println("Number is odd");
//		}
	}

}
