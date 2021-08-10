package day09stringmanipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		
		// 15 -- substring()  //*** first index is inclusive but the last is not
		  					  //*** to get a specific part of a string and it returns String
		
		/*String str = "Java is easy";
		
		System.out.println(str.substring(2 , 5)); // start index is inclusive, end index is exclusive
		
		System.out.println(str.substring(1 , 7)); // ava is
		
		System.out.println(str.substring(8 , 12)); // there is no index 12 but Java will work..
												   // it will use 11 at the end and index is 11 is existed
		System.out.println(str.substring(8)); //easy // keeps accepting till the end
		
		System.out.println(str.substring(5)); // is easy // the beginning index, inclusive.
		
		//System.out.println(str.substring(13)); // IndexOutOfBoundsException
		
		//System.out.println(str.substring(-2)); // IndexOutOfBoundsException
		
		//System.out.println(str.substring(6 ,6)); // gives nothing. this is not an error.
		
		//System.out.println(str.substring(12)); // gives nothing. this is not an error.
		
		*/
		/*
		 * Ask user to enter a String
		 * Print the first and the last character of the String on the console.
		 * 
		 */
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter a String..");
		//String str2 = scan.nextLine();
		//System.out.println("First letter is "+ str2.charAt(0)+ " last letter is " + str2.charAt(str2.length()-1));
		
		//String first = str2.substring(0,1);
		
		//String last = str2.substring(str2.length()-1, str2.length());
		
		//System.out.println("The first letter is "+ first + " and the last letter is " + last);
		
		
		/*Ask user to enter SSN (9 digits)
	     Print the SSN on the console after converting first 5 digits to *
	     Ex: 123456789 ==> *****6789
		*/
		
		//Scanner scann = new Scanner(System.in);
		//System.out.println("Please enter your SSN..");
		//String ssn = scann.nextLine();
		
		//System.out.println((ssn.replace((ssn.substring(0, 5)), "*****")));
		
		
		
		
		// 16 - trim() ==> is used to remove " " from the beginning and after to end it returns String
		String str3 = "    Ali     C   an"; // result is "Ali     C   an" --> it trimmed the spaces at the beginning and at the end
		String trimmedstr3 = str3.trim();
		System.out.println(trimmedstr3);
		
		
		
		//17 - isBlank() ==> is used to check if a String has characters different from "" and " " and it returns boolean
		
		String str4 = "";
		String str5 = " ";
		String str6 = "  .";
		String str7 = "        ";
		
		System.out.println(str4.isBlank()); // true
		System.out.println(str5.isBlank()); // true
		System.out.println(str6.isBlank()); // false (due to the dot)
		System.out.println(str7.isBlank()); // true
	
		// 18 -- replaceAll() is used like replace() + Returns String
		/*
		 * replace() : you can use String and Char as parameter
		 * replaceAll () : you can just use String
		 * in replaceAll() you can use Regular Expressions (regex)
		 * regex is some syntexes which represent multi characters
		 */
		
		// a)--> " \\d " ==> stands for all digits
		//   --> " \\D " ==> stands for all characters different from digits
		
		// b)--> " \\w " ==> stands for _ and a-z and A-Z and 0-9
		//   --> " \\W " ==> stands for all characters different from_ and a-z and A-Z and 0-9
		
		// c)--> " \\s " ==> stands for space
		//   --> " \\S " ==> stands for all characters different from space
		
		// d)--> " \\A " ==> beginning of the String 
		//   --> " \\Z " ==> end of the entire String
		
		// e)--> " [aby] " ==> Stands for all a, b, y
		//       " [^aby] " ==> all characters different from a, b, y
		
		
		
		
		String str8 = "AB78965jkJ02145./!";
		
		System.out.println(str8.replaceAll("\\d", "")); // ABjkJ.!/
		
		System.out.println(str8.replaceAll("\\D", "")); // 7896502145
		
		System.out.println(str8.replaceAll("\\w", "")); // ./!
		
		System.out.println(str8.replaceAll("\\W", "")); // AB78965jkJ02145
		
		System.out.println(str3.replaceAll("\\s", "")); // AliCan
		
		System.out.println(str3.replaceAll("\\S", "*"));//    ***     *   **
		
		
		String str9 = "25.99";
		
		System.out.println(str9.replaceAll("\\A", " Dollar")); // Dollar 25.99
		
		System.out.println(str9.replaceAll("\\Z", " USD")); // 25.99 USD
		
		String str10 = "ali bey is booked ";
		System.out.println(str10.replaceAll("[koy]", "e")); //ali bee is beeeed 
		System.out.println(str10.replaceAll("[^ab]", "*")); //a***b******b******
		
		
		
		
		
		
	}

}
