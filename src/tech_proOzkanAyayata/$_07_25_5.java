package tech_proOzkanAyayata;

import java.util.Arrays;

public class $_07_25_5 extends $_07_25_4{
	 //4.Given a 2d array of ints, find the biggest number(int) in the array and print it.

    /**
     * @param arr is the 2 dim array.
     * @return the max number in the array that is passed in.
     */
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] eachArr : arr){
            for(int num : eachArr){
                if(num > max)
                    max = num;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return max;
    }
	public static void main(String[] args) {
		
		System.out.println(findMax(ArrayGenerator(4,4)));
		


	}

}
