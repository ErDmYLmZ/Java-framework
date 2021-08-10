package officePracticeClass2262021;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		/*ask a user to get numbers and write a program that accepts two integer numbers and checks if they are equal.
		   * Input: first number= 1234
		   *        second number=1234
		   * Output:these numbers are equal
		   * 
		   */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 number to check equality of them..");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		if (n1==n2) {
			System.out.println(n1+" is equal to "+n2);
		}else {
			System.out.println(n1+" is not equal to "+n2);
		}
		
		
		
//				Scanner scan=new Scanner(System.in);
//				System.out.println("Enter first number");
//				int num1=scan.nextInt();
//				System.out.println("Enter second number");
//				int num2=scan.nextInt();
//				if (num1==num2) {
//					System.out.println("These numbers are equal");
//				}else {
//					System.out.println("These numbers are not equal");
//				}
			
			}

		}