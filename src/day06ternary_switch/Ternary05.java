package day06ternary_switch;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		
		//Ask user to enter a number. If the number is less than 10 and greater 
		//than or equal to 0, calculate its cube. Otherwise, calculate its square.
		//Cube of a = a*a*a      Square of a = a*a
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		double n = scanner.nextDouble();
		
		String result = n<10 && n>=0 ? "Cube: " + Math.pow(n, 3): "Square: "+ Math.pow(n, 2);
		
		System.out.println("The result is " + result);
	}

}
