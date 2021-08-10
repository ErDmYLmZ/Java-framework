package officeHours06072021;

import java.util.Arrays;

public class P04SortingArrays {

	public static void main(String[] args) {
//		Sorting numeric or String array
//	     int[] myNums= { 89, 235 , 199 , 146, 201, 1458, 258, 125, 147} ;
//       String[] myString= { "Java", "C#", "Pyhton"} ;
//      Sorting numeric or String array
		
		int[] myNums= { 89, 235 , 199 , 146, 201, 1458, 258, 125, 147} ;
		String[] myString= { "Java", "C#", "Pyhton"} ;
		
		
		System.out.println("Before sorting "+Arrays.toString(myNums));
		Arrays.sort(myNums);
		System.out.println("After sorting "+ Arrays.toString(myNums));
		
		System.out.println("Before sorting "+Arrays.toString(myString));
		Arrays.sort(myString);
		System.out.println("After sorting "+Arrays.toString(myString));
	}

}
