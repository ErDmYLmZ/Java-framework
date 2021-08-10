package officePracticeClass2962021;

import java.util.Scanner;

public class NextThreeNumbers {

	public static void main(String[] args) {
		/*Write a method, getting a number from user than get next 3 numbers.
		 * Example=> input number =15
		 *           output       =16,17,18
		 */

	nextThreeNum();
}
	public static void nextThreeNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number..");
		int num = scan.nextInt();
		
		for(int i=1; i<4; i++) {
			System.out.print(num+i+",");
			
		}
	}
}