package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestions03NoSpace {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
	System.out.println("Please enter a string");
	
	String noSpc = str.nextLine();
	
	noSpace(noSpc);
	
	
	}
	
	
	public static void noSpace(String str) {
		
		System.out.println(str.replaceAll("\\s", ""));
		
		
	}
}
	



