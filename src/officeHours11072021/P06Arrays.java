package officeHours11072021;

import java.util.Arrays;
import java.util.Random;

public class P06Arrays {

	public static void main(String[] args) {
		// Write a method that generates an single dimensional Array 
		//that consists of x numbers random numbers between 1 and 100. 
		//Method will accept int x as an argument.
		
		System.out.println(Arrays.toString(arrayGenerator(10)));
		
	}
		static int[] arrayGenerator(int num) {
			int[] myArray = new int[num];
			for(int i =0; i<myArray.length; i++) {
				myArray[i]= new Random().nextInt(100);
				
			}return myArray;
		}
}
