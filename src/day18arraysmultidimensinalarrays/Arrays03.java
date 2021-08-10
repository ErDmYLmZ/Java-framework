package day18arraysmultidimensinalarrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// how to check if a specific element exists in an array or not
		// 1) Use sort()
		// 2) Then use binarySearch()
		
		
       char crr[]= {'c','A','k','m'};
	    
       //Check if 'x' exists in crr?
       //1.Step:Use sort()
       Arrays.sort(crr);
       //2.Step:
       Arrays.binarySearch(crr, 'x');
       
     //If an element does not exist it returns negative order number (Order number if the element exists)
       
       System.out.println(Arrays.binarySearch(crr, 'x')); //result= -5 ==> negative means "doesn't exist"
       												      // 5 means"the order number" not the index number

       System.out.println(Arrays.binarySearch(crr, 'e')); //result= -3 ==> if "e" existed,it's place would be at 3

       System.out.println(Arrays.binarySearch(crr, 'Z')); //result= -1 ==> if "Z" existed,it's place would be at 2
       
       System.out.println(Arrays.binarySearch(crr, 'l')); //-4
       
       
    // if an element exists, it returns the index of element	 
       
       System.out.println(Arrays.binarySearch(crr, 'c')); // 1==>this is index number not the order number
       													   
       
	}

}
