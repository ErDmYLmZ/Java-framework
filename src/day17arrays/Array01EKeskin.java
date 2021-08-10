package day17arrays;

import java.util.Arrays;

public class Array01EKeskin {

	//We use arrays to store multiple elements into the same container
	//we can store just same data types into the same array
	//we can use just primitive data types theoretically
	//but array itself is non primitive
	//arrays are stored inside Heap memory
	//we reach elements by using index
	
		
	
	public static void main(String[] args) {
	// how to create an array datatype + array name = new + datatype + [size of array]
		int arr[] = new int[5];
    // adding elements into the array
		arr[0]=3;
		arr[1]=2;
		arr[2]=4;
		arr[3]=9;
		arr[4]=7;
		
		
		
	// how to print an array
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[3]);
		// we get indexoutofboundexception if we put a number greater than the arrays' size
		//System.out.println(arr[5]);
		
		
		boolean arr1[] =new boolean[3];
		arr1[0]=true;
		arr1[1]=true;
		arr1[2]=true;
		System.out.println(Arrays.toString(arr1));
		
		
		//how to get number of elements inside an array
		// do not mix it with the method of Length() that we used for String(main difference is "()"
		System.out.println("the size of the array is : "+ arr.length);
		System.out.println("the size of the array is : "+ arr1.length);
	}

}
