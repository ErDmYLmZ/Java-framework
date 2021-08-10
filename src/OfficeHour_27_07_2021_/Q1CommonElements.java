package OfficeHour_27_07_2021_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* write a program to find the common elements between two String Arrays
* (without case sensitivity)
*
* Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
*
* Output : [sofia,brad,emily]
*/
 public class Q1CommonElements {
 

	public static void main(String[] args) {
		String arr1[]= {"John","Brad","Ange","Sofia","Emily"};
		String arr2[]= {"sofia","brad","grace","emily","hazel"};
		
//	System.out.println(commonElements(arr1, arr2 ));
	
		
	//}
//	public static List<String> commonElements(String arr1[],String arr2[] ){
//		List<String> list=new ArrayList<>();
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);		
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr1.length; j++) {
//				if (arr2[i].equalsIgnoreCase(arr1[j])&& !arr1[i].isBlank()) {
//					list.add(arr2[i]);
//				}
//			}
//		}	
//		return list;
	
 
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<arr1.length;i++) {
			for(int j =0; j<arr2.length;j++) {
				if(arr1[i].equalsIgnoreCase(arr2[j])) {
					list.add(arr1[i]);
					
				}
			}
		}
		System.out.println(list);
		
		
		
 }
}
