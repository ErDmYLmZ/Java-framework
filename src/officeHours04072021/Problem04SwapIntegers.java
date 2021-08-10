package officeHours04072021;

import java.util.Scanner;

public class Problem04SwapIntegers {

	public static void main(String[] args) {
//		Ask user to enter two integers
//        1)Swap the integers
//        2)EXAMPLE:
//         INPUT: a= 3
//                b= 5
//         OUTPUT: a= 5
//                 b= 3

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number..");
		int a = scan.nextInt();
		System.out.println("Please enter the second number..");
		int b = scan.nextInt();
		
		int ab = a+b;
		int nb= ab-b;
		int na=ab-nb;
		System.out.println("Before:a= "+a+ " b="+b);
		System.out.println("After :a= "+ na + " b="+nb);
		scan.close();
	}

}
