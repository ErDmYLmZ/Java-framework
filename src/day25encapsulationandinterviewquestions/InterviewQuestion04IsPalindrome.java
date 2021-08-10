package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestion04IsPalindrome {

	public static void main(String[] args) {
		// Create a program checks if a string is palindrome or not
		

		Scanner str = new Scanner(System.in);
		System.out.println("Please enter a string");
		
		String p1 = str.nextLine().toLowerCase().replace(" ", "");
		
		
			
		isPalindrome(p1);
		
			
			
		}
	
	public static void isPalindrome(String p1) {
		
		String revString = "";
		
		for(int i= p1.length()-1; i>=0; i--) {
			 revString+=p1.charAt(i);
			
		}
		if (p1.equals(revString)) {
			System.out.println(p1+" is Palindrome");
		}else {
			System.out.println(p1+" is not palindrome");
		}
		
	}
		
		
	}
	
	
	
	


