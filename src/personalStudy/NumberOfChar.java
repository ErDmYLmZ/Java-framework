package personalStudy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfChar {

	public static void main(String[] args) {
//		Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
//		e.g:
//		char ch1= 'a' ;
//		String name =“John came late" 
//		Expected Output: Number of a = 2
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name..");
		String name = scan.nextLine();
		System.out.println("Please enter a character..");
		char ch = scan.next().charAt(0);
			
		
		for(int i =0; i<name.length() ; i++) {
		if(name.charAt(i)==ch){
			count++;
		}
			
			
			
		}System.out.println( "Number of "+ch+" = " +count);
		
	
		scan.close();
		

  }
	}


