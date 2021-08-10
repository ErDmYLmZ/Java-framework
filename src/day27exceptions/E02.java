package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) {
		
		/*
		 * we can use multiple catch blocks for a single try block
		 * if you use multiple catch block the order should be from child to parent
		 * when you use multiple catch block you can get different messages for each of them for different exceptions
		 * try block can not be used alone
		 * when you typed a code and you get red underline it means you have an exception and it is checked exception
		 * the exception you get in a compile time is checked exception
		 * 
		 * when you get an exception after running your code it is unchecked exception
		 * 
		 * when we use "throws" and if there is an exception it will stop the execution 
		 * if we use "try-catch" and if there is an exception it will not stop the execution
		 * 
		 */
		
	 
		try {
			FileInputStream fileInputStream = new FileInputStream("src/day27exceptionsg/TextFile01");
			 int i = 0;
			 while((i=fileInputStream.read())!=-1) {
					System.out.print((char)i);
				}
		} catch (FileNotFoundException e) {
			
			// e.getMessage() gives us little information
		System.err.println("Ooops! wrong path or file not exist. Please check "+e.getMessage());
		//e.printStackTrace gives us detailed information about our exception
		e.printStackTrace();
		} catch (IOException e) {
				System.out.println("Having trouble to read the file");
				System.err.println("Having trouble to read the file"+e.getMessage());
				
			}
		
		
	}

}