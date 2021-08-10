package day03increament_decrement_operations;

public class SwapQuestion {

	public static void main(String[] args) {
	
		/*
		 swap the values of two integer
		 
		 a=12; b=5 ==> a=5; b=12
		 */
		
		// 1.way
		
		int a = 12;
		int b = 5;
		int temp = 0;
		System.out.println("Before the swap a is " + a);
		System.out.println("Before the swap b is " + b);
		
		//assign b to temp
		temp = b;
		
		//assign a to b
		b = a;
		//assign temp to a
		a = temp;
		
		System.out.println("After the swap a is " + a);
		System.out.println("After the swap b is " + b);
		
		//2.way
		
		int c = 20; // c=15
		int d = 15; // d=20
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println("After the swap c is " + c);
		System.out.println("After the swap d is " + d);
		
	}

}
