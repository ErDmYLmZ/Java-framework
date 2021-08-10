package officeHours11072021;

public class P04Palindrome {

	public static void main(String[] args) {
		//Write a method that checks if word is palindrome. 
		//A palindrome is a word, number, phrase, or other sequence 
		//of characters which reads the same backward as forward, 
		//such as madam or racecar or the number 10801.
		
		System.out.println(isPalindrome("madam"));
		
	}
	//5. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    static boolean isPalindrome(String str){
       // 1st Logic:
        for(int i = 0, j = 1; i < str.length()/2; i++, j++){
            if(str.charAt(i) != str.charAt(str.length() - j))
                return false;
        }
        return true;
        //2nd Logic:
//        String reversed = isReverse(str);
//        return reversed.equals(str);
    }}