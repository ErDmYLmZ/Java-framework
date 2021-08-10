package officeHours06072021;

import java.util.Arrays;

public class P05StringToArray {

	public static void main(String[] args) {
		/* create a custom return type method accepts a name as parameter
		        * and prints the name as a char array
		        * (do not use toCharArray() method)
		        * Input : John
		        * Output : [J, o, h, n]	
		        */
     String arr="John";

     parameter(arr);
	}
    public static void parameter(String arr) {
	String spt[]=arr.split("");
	System.out.println(Arrays.toString(spt));
}
}
