package officePracticeClass2962021;

import java.util.Scanner;

public class CubeWithMethod {

	public static void main(String[] args) {
		
		/*Write a method and get a number from user then calculate cube of this number
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		double num = scan.nextDouble();
		System.out.println(cube(num));
		
	}
	
     public static double cube (double num) {
	 return Math.pow(num, 3);
	
	

		}
}
