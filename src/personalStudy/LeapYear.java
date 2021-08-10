package personalStudy;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//	    Sample:
//
//	        INPUT:
//
//	      Input a month number: 2
//
//	      Input a year: 2016
//
//	        OUTPUT  :
//
//	      February 2016 has 29 days
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a month number: ");
		int month = scan.nextInt();
		System.out.println("Input a year: ");
		int year = scan.nextInt();
     switch (month) {
	case 1:
		System.out.println("January "+ year + " has 31 days");
		break;
	case 2:
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
			System.out.println("February "+ year + " has 29 days");
		}else {System.out.println("February "+ year + " has 28 days");
		}break;
		
	case 3:
		System.out.println("March "+ year + " has 31 days");
		break;
	case 4:
		System.out.println("April "+ year + " has 30 days");
		break;
	case 5:
		System.out.println("May "+ year + " has 31 days");
		break;
	case 6:
		System.out.println("Jun "+ year + " has 30 days");
		break;
	case 7:
		System.out.println("July "+ year + " has 31 days");
		break;
	case 8:
		System.out.println("August "+ year + " has 31 days");
		break;
	case 9:
		System.out.println("September "+ year + " has 30 days");
		break;
	case 10:
		System.out.println("October "+ year + " has 31 days");
		break;
	case 11:
		System.out.println("November "+ year + " has 30 days");
		break;
	case 12:
		System.out.println("December "+ year + " has 31 days");
		break;

	default:
		break;
	}
		
		
		
		
		
	}

}
