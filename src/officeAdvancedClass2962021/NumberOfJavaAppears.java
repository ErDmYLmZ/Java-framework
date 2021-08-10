package officeAdvancedClass2962021;
public class NumberOfJavaAppears {
	public static void main(String[] args) {
	  /*Write a method and calculate how many JAVA is typed on the string.
	   * Example intput str="javajavaxxxahmet"
	   */
	  String str="javajavaxxxahmet";
	  dummy(str);
}
	public static void dummy(String str) {
     		int num=(str.length()-(str.replace("java","")).length())/4;
     		System.out.println("JAVA word is repeated= "+num+" times");
	}
}

//package officeAdvancedClass2962021;
//
//public class NumberOfJavaAppears {
//
//	public static void main(String[] args) {
//		/*Write a method and calculate how many JAVA is typed on the string.
//		   * Example intput str="javajavaxxxahmet"
//		   */
//	noja();
//	}
//	
//	public static void noja() {
//	String str = "javajavaxxxahmet";
//	int counter= 0;
//	
//	for(int i =0; i<str.length();i++) {
//	if(str.substring(i).startsWith("java")) {
//		counter++;
//	}
//	}
//	System.out.println(counter);
//		
//	}
//
//}
