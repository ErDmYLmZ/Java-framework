package day04_concat__if_ifelse;

public class Concatenation01 {

	public static void main(String[] args) {

		/*
		 * Concatenation is used to join Strings
		 */
		
		/*
		String fn1 = "Ali";
		String ln1 = "Can";
	
		
		System.out.println(fn1+" "+ln1);
		*/
		
		String fname= "Ayse";
		String lname= "Cool";
		
		System.out.println(fname+" "+lname);
		
		System.out.println(fname + 6);//Ayse6
		System.out.println(fname+ 6 + 5); //Ayse65
		System.out.println(fname+ (6 + 5)); //Ayse11
		System.out.println(5+ fname+ (6 * 5)); //5Ayse30
		
		//*Question:By using following variables print 61Study-1 on the console
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
	
		System.out.println((2*3)+""+(3-2)+ str1+"-"+(3-2));
		
	}

}
