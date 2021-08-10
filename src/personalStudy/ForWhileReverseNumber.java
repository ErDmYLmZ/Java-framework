package personalStudy;

import java.util.Scanner;

public class ForWhileReverseNumber {

	public static void main(String[] args) {
//		Write a java program to reverse the number which user entered.
//
//		Input :1238
//		Output :Reverse Of The Number: 8321
		Scanner scn = new Scanner(System.in);
		String num=scn.next();
		String rev ="";
		for(int i=num.length()-1; i>=0; i--) {
			System.out.print(rev+num.charAt(i));
		}
	}

}
