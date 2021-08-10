package tech_proOzkanAyayata;

import java.util.ArrayList;
import java.util.List;
/*
		5. Write a method that collects the all positive Armstrong numbers 
		up to the number that is passed in. Armstrong is a number that is 
		equal to the sum of its own digits and each digit being raised to 
		the power of the number of digits. EX: 371 = 3^3 + 7^3 + 1^3 => 371	
		*/
public class $_07_25_6 {
	
	static int numOfDigits(int num) {
		int digits = 0;
		while(num>0) {
			num/=10;
			digits++;
		}
		return digits;
	}
	
	static boolean isArmstrong(int num) {
		String str = String.valueOf(num);
		int sum = 0;
		for(int i =0; i<str.length();i++) {
			int  each = Integer.parseInt(str.substring(i, i+1));
			sum+=Math.pow(each, numOfDigits(num));
		}
				
		return sum == num;
	}
	
	static ArrayList<Integer> listOfArmstrong(int num){
		
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i =0; i<= num; i++) {
			if(isArmstrong(i))
				a1.add(i);
		
		}return a1;
	}
	
//	static List<Integer> findTheArmstrongNumbers(int a){
//		List<Integer> list = new ArrayList<>();
//		for(int i=0; i<=a; i++) {
//			if(isArmstrong(i)) {
//				list.add(i);
//			}	
//		}
//		return list;
//	}
//	
//	static boolean isArmstrong(int a) {
//		int sum=0;
//		int num=a;
//		do {
//			sum = sum + (int)Math.pow(a%10, 3);	
//			a=a/10;	
//		}while(a!=0);		
//		return sum==num; 
//	}
//*******************************************************************
//	public static boolean isArmstrong(int num) {
//		int sum=0;
//		String str=""+ num;
//	for (int i = 0; i <str.length(); i++) {
//		
//		char ch=str.charAt(i);
//		int x= Character.getNumericValue(ch);
//		
//		
//			sum+=x*x*x;
//		}
//	
//	return sum==num;
//	}
//	
//	
//	static ArrayList<Integer> listOfArmstrong(int num){
//		
//		ArrayList<Integer> al=new ArrayList<>();
//		
//		for (int i = 0; i < num; i++) {
//			
//			if(isArmstrong(i)) {
//				al.add(i);
//			}
//			
//		}
//		
//		
//		
//		return al;
//	}
	
	public static void main(String[] args) {
		
		System.out.println(listOfArmstrong(100000));

		
	}

}
