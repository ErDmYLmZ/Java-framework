package officeHours06072021;

import java.util.Arrays;

public class P02ReverseArray {

	public static void main(String[] args) {
		/* Write a Java program that reverse a sentence by using Array
        * (with all spaces and special characters)
        *
        * Input : Coding is greate.
        *Output : .etaerg si gnidoC
        */
        String str = "Coding is greate.";
		String arr[] = str.split("");
 		//System.out.println(Arrays.toString(arr));
				
 		//for (int i=arr.length-1;i>=0;i--) {
 			
 			//System.out.print(arr[i]);
 			
 			//Scanner input=new Scanner(System.in);
 			//String str=input.nextLine();
// 			StringBuilder sb=new StringBuilder(str);
// 			sb.reverse();
// 			System.out.print(sb);
 			StringBuilder revstr = new StringBuilder(str);
 			System.out.println( revstr.reverse());
 		//}
 		
	}

}
