package officeAdvancedClass2962021;

public class Reverse {

	public static void main(String[] args) {
	       /*write a method using StringBuffer class reverse method, to get reverse any string.
	        * 
	        */
		String str="nugre";
		rev(str);
	}
public static void rev (String str) {
	StringBuffer str1 = new StringBuffer(str);
	System.out.println(str1.reverse());
}
}
