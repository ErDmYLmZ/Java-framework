package day34maps;

import java.util.Arrays;
import java.util.HashMap;

public class HasMap01 {

	public static void main(String[] args) {
		
		/* How to count the number of occurance of the words in a sentences
		 * "Java is easy. Type codes to learn Java. To earn money learn Java."
		 * Java=3, is=1, easy=1,Type=1,....,learn=2,...
		 */
		
		
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		
		System.out.println(str);
		
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		
		System.out.println(str);
		
		
		HashMap<String, Integer> result = new HashMap<>();
		
		String words [] = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for(String w : words) {
			
			Integer numOfValues = result.get(w);
			
			if (numOfValues==null){
				
				result.put(w, 1);
				
			}else {
				result.put(w, numOfValues+1);
			}
			
		}
		System.out.println(result);
		
	}

		//Type code to see the number of occurances of the characters in a given String
	
	
	
	
	
}
