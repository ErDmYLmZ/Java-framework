package day25encapsulationandinterviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions01SumOfArray {

	public static void main(String[] args) {
		
	
		
		// get an array from the user and find the sum
		
		
		Scanner arr = new Scanner(System.in);
		System.out.println("Please enter the size of the array..");
		
		int arrSize = arr.nextInt();
		
 
		int arr1 [] = new int[arrSize];
		
	
		for(int i =0; i<arrSize; i++) {
			
			
			System.out.println("Please enter the "+ (i+1) + ". Element");
			
			arr1[i]=arr.nextInt();
			
		}
			System.out.println(Arrays.toString(arr1));
		
		int sum = 0;
		 for (int w : arr1) {
			
			 sum=sum+w;
			 
		}
		System.out.println(sum);
		
		Arrays.sort(arr1);
		System.out.println("The difference is :"+(arr1[arrSize-1]-arr1[0]));
		
		
		
		
		
		
		
	}

}
