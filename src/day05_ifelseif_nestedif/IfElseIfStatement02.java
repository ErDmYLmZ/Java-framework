package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		//Get the day name from user, 
		// then tell to the user if it is week day or weekend day

		Scanner scan = new Scanner(System.in);
		System.out.println("Please eter a day name..");
		String day1 = scan.next();
		
		if (day1.equalsIgnoreCase("Sunday") || day1.equalsIgnoreCase("Saturday")) {
			System.out.println("It is weekend");
		} 
		else if (day1.equalsIgnoreCase("Monday") ||
			day1.equalsIgnoreCase("Tuesday") ||
			day1.equalsIgnoreCase("Wednesday") ||
			day1.equalsIgnoreCase("Thursday") ||
			day1.equalsIgnoreCase("Friday"))
			{
				
			System.out.println("It is a weekday");}
		else {
			System.out.println("Please enter only a day name!!!");
		}
	}

}
