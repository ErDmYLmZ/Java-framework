package officeHours06072021;

import java.util.Arrays;

public class P07MinMaxNum {

	public static void main(String[] args) {
		/* write a method that accepts an integer array as input and prints the minimum
        * and the maximum numbers from given array
        *
        *
        * Input : {3,2,5,4,1,6}
        * Output : min: 1 max : 6
        */
        int arr []={3,2,5,4,1,6};
        
        srt(arr);

	}public static void srt(int arr[]) {
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		System.out.println("Min element of the array : "+ arr[0]);
		System.out.println("Max element of the array : "+ arr[arr.length-1]);
	}

}
