package officeHours11072021;

public class P03ReverseOfString {

	public static void main(String[] args) {
	    //4. Write a method that accepts a String and returns 
		//reverse of the same String. EX: java -> avaj
System.out.println(rev("java"));
	}
	
	
	public static String rev(String str) {
		String result="";
		for(int i = str.length()-1; i>=0; i--) {
			
		result+=str.charAt(i);
		}
		return result;
	}

}
