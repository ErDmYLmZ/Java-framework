package personalStudy;

import java.util.Scanner;

public class ReplitTernary_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String..");
		String str = scan.next();
		
		for(int i =0; i<3;i++) {
		String result= str.length()>2 ? str.substring(str.length()-2):"Entry must contains min 2 characters";
System.out.print(result);
	}
		}

}
