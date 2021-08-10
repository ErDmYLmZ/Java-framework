package officeHours06072021;

import java.util.Arrays;

public class P03PrintingArray {

	public static void main(String[] args) {
		// ! Create a static void method: acceptArray
        // It should take one String array as parameter
        // ! and print them as an array
        // ! e.g String[] array = { "sam", "john", "tom" };
        // ! acceptArray(array);
        // ! Then output: [sam,john,tom]
        // ! Create another static method :acceptArray2
        // It should take one String array as parameter
        // ! and print each element in the array
        // ! e.g String[] array = { "sam", "john", "tom" };
        // ! acceptArray2(array);
        // ! Then output: sam john tom
		
		
		String arr[] = { "sam", "john", "tom"};
		print(arr);
		print2(arr);

	}
	
	public static void print(String arr[]) {
		
			System.out.println(Arrays.toString(arr));
		}
	public static void print2(String arr[]) {
		for(String w:arr) {
			System.out.print(w+" ");
		}
	
	}public static void print3(String arr[]) {
		
	

}

}

