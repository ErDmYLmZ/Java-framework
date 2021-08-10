package officeHours04072021;

import java.util.Scanner;

public class Problem07AreaOfSquare {

	public static void main(String[] args) {
//		* ask the user about one side of the square
//        * find the area and perimeter of the square
//        * print on the console
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one side of the square..");
		int side = scan.nextInt();
		
		System.out.println("The area of the square is "+ (side*side)+ " and the perimeter is "+ 4*side);
		
		scan.close();
		
	}

}
