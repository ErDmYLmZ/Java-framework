package day28exceptions;

public class E03 {

	public static void main(String[] args) {
		
		/*
		 * 1)ArrayIndexOutOfBoundsException 
		 *   unchecked exception
		 *   when we try to get an element from an unexisting  index
		 *   
		 * 2)ClassCastException
		 *   unchecked exception
		 *   when we try to cast a data type into another one which is not supported
		 *   
		 * 3)NumberFormatException
		 *   unchecked exception
		 *   when we try to convert non-digit char to the integer by using parseInt  
		 * 
		 */
		
		//ArrayIndexOutOfBoundsException
//		
//		String s[]= {"Selen","Zeki","Bahar","Muhammed"};
//		System.out.println(s[0]);//selen
//		try {
//		System.out.println(s[6]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Please check the length of your array ;( " +e.getMessage());
//		}
		
		//ClassCastException
		
//		Object o = 43;
//		
//		//String num =o;
//		String num = (String)o;
//		
		
		//NumberFormatException
		String s1 = "123";
		System.out.println("before converting to the string "+s1);
		int num1 = Integer.parseInt(s1);//convert our string into an integer
		System.out.println(num1+2);
		
		String s2 = "2e4r5t";
		try {
		int num2 = Integer.parseInt(s2);
		System.out.println(num2);
		}catch(NumberFormatException e) {
			System.out.println("You try to convert unnumerical characters to the integer. Do not do that!");
		}
		//*******************************************************
		
		
//public class E03 {
//	
//	/*
//	 	1)ArrayIndexOutOfBoundsException is thrown if you use non-existing index in Arrays
//	 	2)ArrayIndexOutOfBoundsException is an un-checked exception
//	 	
//	 	3)ClassCastException is thrown if you try to cast a data type to another which is not supported by Java
//	 	4)ClassCastException is an un-checked exception
//	 	
//	 	5)NumberFormatException is thrown if you use non-digit characters in a String and use parseInt()
//	 	4)NumberFormatException is an un-checked exception
//	*/
//
//	public static void main(String[] args) {
//		
//		//ArrayIndexOutOfBoundsException	
////		String s[] = {"A", "D", "B", "C"};		
////		System.out.println(s[2]);//B		
////		try {			
////			System.out.println(s[4]);//ArrayIndexOutOfBoundsException			
////		}catch(ArrayIndexOutOfBoundsException e) {			
////			System.out.println("Do not use non-existing index " + e.getMessage());			
////		}
//		
//		//ClassCastException
////		Object obj = 70;		
////		String num = (String)obj;
//		
//		//NumberFormatException
//		String s1 = "123";
//		int num1 = Integer.parseInt(s1);
//		System.out.println(num1 + 5);//128
//		
//		String s2 = "1a2b3c";
//		try {
//			int num2 = Integer.parseInt(s2);//NumberFormatException
//			System.out.println(num2 + 5);
//		}catch(NumberFormatException e) {
//			System.out.println("You used non-digit characters in the String");
//		}
//		
		
		

	}

}