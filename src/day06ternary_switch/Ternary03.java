package day06ternary_switch;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		
	/*Ask user to enter a String. If the String has 2 characters, output will be  
“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”	
	*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		// Ternary structure is 
		//"                  Condition ?                code1                       :                 code2  "
		//if two code is same you  can create a container
		//otherwise you can use system.out.println()
		//last choice is to turn two types into same type
		
		String result = s.length()==2  ? "It is a valid for state abbreviations"	:  "It is a valid for state abbreviations";	
		
		
	}

}
