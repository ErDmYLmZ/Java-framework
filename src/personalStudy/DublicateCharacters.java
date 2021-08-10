package personalStudy;

import java.util.Scanner;

public class DublicateCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
        int count=0;
		
		
		for(int i =0; i<name.length();i++){
			for(int j =i+1; j<name.length(); j++){
		 if(name.charAt(i)== name.charAt(j)) {
			 count++;
		 }
	} 
}String result= count>0 ? "String has duplicate characters":"String has unique characters";

		System.out.println(result);   

	}

	}
