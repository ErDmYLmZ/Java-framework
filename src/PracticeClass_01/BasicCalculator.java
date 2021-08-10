package PracticeClass_01;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two numbers Show them e menu of operation signs and ask
		 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
		 * Division : 4 Print the result on the console
		 *
		 * EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please choose an operator\n1.for addition\n2.for Subtraction\n3.for Multiplication\n4.for Division");
		int operator = scanner.nextInt();
		System.out.println("Please enter the first number");
		int fn = scanner.nextInt();
		System.out.println("Please enter the second number");
		int sn = scanner.nextInt();
		System.out.println();
		
		switch(operator) {
		case 1:
			System.out.println("The result of addition is "+ (fn+sn));
			break;
		case 2:
			System.out.println("The result of subtraction is "+ (fn-sn));
			break;
		case 3:
			System.out.println("The result of multiplation is "+ (fn*sn));
			break;
		case 4:
			System.out.println("The result of division is "+ (fn/sn));
			break;
			default:
				System.out.println("Wrong Operation");
		}
		
		
		
		
		

	}

}
