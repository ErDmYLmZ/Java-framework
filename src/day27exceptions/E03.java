package day27exceptions;

public class E03 {

	public static void main(String[] args) {
		int a = 36;
		int b = 0;
		
		try {
		
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.err.println("Zero divison error. Do not use zero as a divider " + e.getMessage());
			System.err.println("you reach the infinity");
			
		}

	}

}