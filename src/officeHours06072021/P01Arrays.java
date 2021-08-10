package officeHours06072021;

import java.util.Arrays;
import java.util.Scanner;

public class P01Arrays {

	public static void main(String[] args) {
		/* Ask the user for an integer less than 100
        A method that returns to the user whether
        it is in a predefined array or not. write
      *
      * Array={3,5,21,32,34,45,56,57,76,87,95}
      *
      * Input : 5 Output: The number you entered is in the Array
      * Input : 15 Output: The number you entered is not in the Array
      */
		
		
		
		int arr[] = {3,5,21,32,34,45,56,57,76,87,95};      
		inArray(arr);
			
		}
	public static void inArray(int arr[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer less than 100..");
		int usernum = scan.nextInt();
				
		for(int i=0; i<arr.length;i++) {
			if(usernum==arr[i]) {
				System.out.println("Your number is in the array");
				break;
				
			}else {
				System.out.println("Your number is not in the array");
				break;
			}
		}
	}
	
	}


