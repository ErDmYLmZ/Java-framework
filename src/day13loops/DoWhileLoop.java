package day13loops;

public class DoWhileLoop {

	public static void main(String[] args) {
	/*For the String "1234_?!abcdef", type a code to count the number of letters,
	the number of digits and the number of others by using do-while loop
	*/	
		String str = "1234_?!abcdef";
		int digitCount = 0;
		int letterCount = 0;
		int otherCount = 0;
		
		int i = 0;
		
		do {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				letterCount+=1;}
				else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				digitCount+=1;}
				else  {
					otherCount+=1;}
			i++;
					
				
				
				
			
			
		} while (i<str.length());
		
		System.out.println(letterCount+"==> Letters");
		System.out.println(digitCount+"==> Digits");
		System.out.println(otherCount+"==> Others");
		

	}

}

	
	
