package officeHours11072021;


public class P02findTheDup {
	
	
	
	public static void main(String[] args) {
		//2. Write method that accepts a String and removes 
		//all duplicate from String. EX : aaabbc --> abc
	System.out.println(removeDuplicates("aaaaa"));
	
	}
		static String removeDuplicates(String str){
		    String result = "";
		    for(int i = 0; i < str.length(); i++){
		        char eachLetter = str.charAt(i);
		        if(!result.contains(eachLetter + ""))
		            result += eachLetter;
		    }
		    return result;
		}
	}