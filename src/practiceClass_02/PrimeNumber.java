package practiceClass_02;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*Explanation about primeNumber,Prime numbers are numbers that have only 2 factors:
         * 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11. 
         * By contrast, numbers with more than 2 factors are call composite number.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number if it is a Prime number or not ");
		int num = scan.nextInt();
		int cont=0;
		for(int i=2 ; i<num; i++) {
			 if (num%i==0) { 
				 cont+=1;				 
			 }
		} 
		String result = cont==0 ? num+" is a prime number":num+"is not aprime number";
        System.out.println(result);
}

}
