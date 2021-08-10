package practiceClass_02;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		//1.Ask user to enter a word. If the word has odd number of characters
				//length() of characters
		        //and has 3 or more characters, print the character in the middle of the word.

		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter a String");
		 String word =scan.nextLine();
		 
		 if(word.length()>3 && word.length()%2!=0) {
			//1.way 
			//System.out.println("The middle Char is " + word.charAt(word.length()/2));
			 
			//2.way
			 System.out.println(word.substring(word.length()/2, word.length()/2+1));
			 
		 }else {
			 System.out.println("The name is not proper");
			 
			 /*//System.out.println(word.substring(2,4));
	 if(word.length()>=3&&word.length()%2==1) {
		 String str=word.substring(word.length()/2,word.length()/2+1);
		 System.out.println(str);
	 }else {
		 System.out.println("it has even number of chars.");
	 }*/
		 }
		
		
	}

}
