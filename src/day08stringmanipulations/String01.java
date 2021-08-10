package day08stringmanipulations;

public class String01 {

	public static void main(String[] args) {
		
		//8- indexOf() ==>it returns a specific character/s and it returns int
		
		String str1 = "Java is fun to learn and earn..";
		
		System.out.println(str1.indexOf('i')); //the index of the first occurrence of the character in the
		
		System.out.println(str1.indexOf("fun")); // if you use multiple characters indexOf() returns the first characters index
		
		System.out.println(str1.indexOf("iss")); //if there is no such occurrence it returns -1
		
		System.out.println(str1.indexOf(" ")); // 4
		
		System.out.println(str1.indexOf('a', 2)); //3==> 2 means the index to start the search from
	
		System.out.println(str1.indexOf(' ', 5)); //result is 7
		
		System.out.println(str1.indexOf("arn" , 20)); // result is 26
		
		//9. lastIndexOf()	
		
		String str2 = "Learn Java earn money";
		
		System.out.println(str2.lastIndexOf('o')); //the index of the last occurrence of the character
												   // result is 17. the difference is this method starts to count from the end.
		System.out.println(str2.lastIndexOf('a')); //12
		
		System.out.println(str2.lastIndexOf("")); // result 21
		
		System.out.println(str2.lastIndexOf(" ")); 	// result 15
		
		System.out.println(str2.lastIndexOf("j")); // -1 ==> if the character does not occur
		
		System.out.println(str2.lastIndexOf('j'));  // -1
		
		
		System.out.println(str2.lastIndexOf('a' , 10)); //9==> searching backward starting at the specified index.
		
		System.out.println(str2.lastIndexOf('n' , 8)); //4
		
		//10 - startWith() ==>true, if the character sequence represented
		                 //==>false, if the character sequence is NOT represented
		
		String str3 = "Java is easy";
		
		System.out.println(str3.startsWith("j")); // False
		
		System.out.println(str3.startsWith("J")); // True
		
		//System.out.println(str3.startsWith('J')); startsWith() accepts only String thats why double quote is must be used
		
		System.out.println(str3.startsWith("is , 5")); // True index 5 means where to begin looking in this string
		
		
		//11 - endsWith() // Tests if this string ends with the specified character/s, String.
		
		System.out.println(str3.endsWith("y")); //true
		
		System.out.println(str3.endsWith("ya")); //false
		
		System.out.println(str3.endsWith("easy")); //true
		
		System.out.println(str3.endsWith("is easy"));// true
		
		//12 - isEmpty() ==>Returns true if, and only if, the length() is 0.
		
		String str4 = "";
		System.out.println(str4.isEmpty());//true
		
		//String str4 = " "; *********  space is accepted as a character
		//System.out.println(str4.isEmpty());//false
		
		//String str5 = null; // ********* null does not have container so it can not be checked if true or false.
		//System.out.println(str5.isEmpty());
		
		
		//13 - concat() ==> Concatenates the specified string to the end of this string.
		
		String str6 = "Ali";
		String str7 = " is Cool";
		
		System.out.println(str6 + str7); // Ali is Cool
		
		System.out.println(str6.concat(str7)); // Ali is Cool
		
		// @param   str   the String that is concatenated to the end of another String.
		
		System.out.println(str6.concat(" is not cool").concat(" but smart"));
		
		
		//14- replace() ==> Returns a string resulting from replacing all occurrences of oldChar in this string with new char
		                  // Both "" and '' is accepted. 
		String str8 = "abcc$1252";
		System.out.println(str8.replace("2", "3")); // abcc$1353
		System.out.println(str8.replace("ab", "cc")); // cccc$1353
		//System.out.println(str8.replace("ab", 'c')); // compile time error. because both types must be same. it should be like this ("ab" , "c")
		System.out.println(str8.replace("8", "")); // abcc$1252
		System.out.println(str8.replace('8', '9')); // $1259
		// System.out.println(str8.replace("8", " ")); is accepted as well
		
		System.out.println(str8.replace('$', ' ')); // 1258
		
		String str9 = "Java is easy to learn";
		
		System.out.println(str9.replace("easy", "hard").replace("hard", "easy")); 
		
		
		System.out.println(str9.replace("Java", "Selenium_:)")); 
		
		
	}

}
