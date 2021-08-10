package day06ternary_switch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of a month...");
		String m = scanner.nextLine().toLowerCase();
		/*
		 * inside the switch() parenthesis, you can use String, char, byte, short, int
		 * but boolean, long, float and double should not be used.
		 */
		switch(m) {
		
		    case "january":
		    	System.out.println("1.Month");
		    	break;
		    case "february":
		    	System.out.println("2.Month");
		    	break;
		    case "march":
		    	System.out.println("3.Month");
		    	break;
		    case "april":
		    	System.out.println("4.Month");
		    	break;
		    case "may":
		    	System.out.println("5.Month");
		    	break;
		    case "june":
		    	System.out.println("6.Month");
		    	break;
		    case "july":
		    	System.out.println("7.Month");
		    	break;
		    case "august":
		    	System.out.println("8.Month");
		    	break;
	        case "september":
	        	System.out.println("9.Month");
	    	    break;
	        case "october":
	        	System.out.println("10.Month");
	    	    break;
	        case "november":
	        	System.out.println("11.Month");
	    	    break;	
	        case "december":
	        	System.out.println("12.Month");
	    	    break;
	    	default:
	    		System.out.println("r u idiot?");
	    	
		
		}
		

	}

}
