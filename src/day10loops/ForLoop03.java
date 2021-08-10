package day10loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		//Ask user to enter String
		//Check if the String is Palindrom or not
		//for example anna<==>anna
		//for example 1223221<==>1223221
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
	
	String reversed = "";
	
	// Reverse String s
	for(int i = s.length()-1; i>=0; i--) {
		reversed = reversed + s.charAt(i);
		}
		//Screen Shot 2021-06-19 at 4.25.29 PM
	if(s.equalsIgnoreCase(reversed))	{
		System.out.println(s + " is palindrome");
		
	} else {
		System.out.println(s + " is not palindrome");
	}
	}
	
	}


