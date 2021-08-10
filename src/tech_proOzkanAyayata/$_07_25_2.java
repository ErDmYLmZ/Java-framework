package tech_proOzkanAyayata;

public class $_07_25_2 {
//	1.A sandwich is two pieces of bread with something in between. 
//	Print the string that is between the first and last appearance of 
//	"bread" in the given string, or return string "nothing" if there are 
//	not two pieces of bread.

	/*
	 * @param str
	 * @returns String between the word of breads otherwise returns "nothing"
	 * 
	 */
	
static String isSandwich(String str) {
	
	int first = str.indexOf("bread");
	int second = str.lastIndexOf("bread");
	if(first == second)
		return "nothing";
	return str.substring(first+5, second);
	}
			
	public static void main(String[] args) {

		System.out.println(isSandwich("breadpatiebreadmeatbreadbreadpicklesbread"));
		
		}
		
	

}
