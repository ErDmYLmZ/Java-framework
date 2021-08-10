package personalStudy;


public class AsciiValueOfAlphabet {

	public static void main(String[] args) {
//		Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
//
//		Expected Output:
//
//		Ascii value of a = 97
		
	int i = 'a';
	while(i<='z') {
			System.out.println("Ascii value of "+ (char)i +" = " +i);
			i++;
		}
		
	}
}


