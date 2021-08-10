package officeHours04072021;

import java.util.Scanner;

public class Problem06SumOfDigits {

	public static void main(String[] args) {
//		* ask user to enter an integer number
//        * find the sum of digitnumber
//        * example 345=12
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer..");
		int usr = scan.nextInt();
		int sum = 0;
		while (usr > 0) {
			sum = sum + usr % 10;
			usr = usr / 10;
		}
		System.out.println(sum);
		scan.close();
			
			
		
			
		}
		
	}


