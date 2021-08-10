package day28exceptions;

public class E02 {

	public static void main(String[] args) {
		
		   /* NullPointerException is unchecked exception==> run time exception
				 * when we try to get sth which is null
				 * 
				 * we can not use "try block" alone
				 * a) try+catch
				 * b)try+multiple catch
				 * c)try+catch+finally  /   try+multiple catch+finally
				 * d)try+finally
				 * 
				 * we can use finally to close our file or database. it will be executed in any condition
				 * if we do not close our database 
				 * it can cause some security problems
				 * data leakage
				 * it means you will pay a lot to the cloud company
			 */

		String str1="";
		System.out.println(str1.length());//0
		
		String str2 = null;
		try {
			System.out.println(24/0);
			System.out.println(str2.length());//NullPointerException
			
		} catch (NullPointerException e) {
			System.out.println("Please do not use length() method for null object");
		}catch(ArithmeticException e) {
			System.out.println("Please do not try to divide a number by zero");
		}finally {
			System.out.println("This will be printed in any condition");
			System.out.println("Java says Enough of your problems");
		}
		
		System.out.println("I love Java");	
		
		//********************************************************
		
		/*package day28exceptions;

		public class E02 {
			
			/*
			 	1)If you use for example length() method for "null" String object, you will get 
			 	  "NullPointerException"
			 	2)"NullPointerException" is an "unchecked exception"
			 	3)If there is no parent-child relationship between Exception Classes, the order of catch-blocks
			 	  is not important
			 	4)try-block cannot be used alone, it can be used like the followings;
			 		a)try + catch
			 		b)try + multiple catch
			 		c)try + catch or multiple catch + finally
			 		d)try + finally
			 */

//			public static void main(String[] args) {
//				
//				String s1 = "";
//				System.out.println(s1.length());//0
//				
//				String s2 = null;
//				
//				try {
//					
//					System.out.println(12 / 0);
//					
//					System.out.println(s2.length());//NullPointerException
//						
//					
//				}catch(ArithmeticException e) {
//					
//					System.out.println("Do not divide by zero... " + e.getMessage());
//					
//				}catch(NullPointerException e) {
//					
//					System.out.println("Do not use length() for null. " + e.getMessage());
//					
//				}finally {
//					
//					System.out.println("finally part will be executed under every condition");
//					
//				}
//				
//				System.out.println("Will that code be executed?");
//
//			}
//
//		}
//	
		
	}

}
