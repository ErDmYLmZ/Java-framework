package personalStudy;

import java.util.Scanner;

public class CcnNumber {

	public static void main(String[] args) {
	/*	Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
		(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
		Input :
		John White 1234234534561478
		Output :
		Name : J* W**
		CCN : ** ** **** 1478
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next().toUpperCase();
		System.out.println("Please enter your surname");
		String surname = scan.next().toUpperCase();
		System.out.println("Please enter your CCN");
		String ccn = scan.next();
		
		if(ccn.length()==16) {
					
		String n1=name.replace(name.substring(1), "*");  
		String sn=surname.replace(surname.substring(1), "**"); 
		String ccn1 =ccn.replace(ccn.substring(0,12), "** ** **** ");
		System.out.println("Name : "+n1 +" "+ sn);
		System.out.println("CCN : "+ ccn1);
		
		}else {
			System.out.println("Invalid credit card number");
		}
	}
		
	}
