package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
//type a program to find the sum of the integers from 1 to 100
	
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum = sum+i;
			
		}System.out.println("The sum of 1 to 100 is "+sum);
	
	
	/*Ask user to enter staring and ending value,
	 * then find the sum of all integers from the starting to ending value
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a start value");
		int x=scan.nextInt();
		System.out.println("Enter a end value");
		int y=scan.nextInt();
		int sum1=0;
		
		if (x>y) {
			System.out.println("Invalid entry");
		
		}else {
			for(int i=x; i<y+1;i++) {
			sum1=sum1+i;
		}System.out.println(sum1);
		}
		
	
	}

}
