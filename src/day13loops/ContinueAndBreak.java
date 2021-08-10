package day13loops;

import java.util.Scanner;

public class ContinueAndBreak {

	public static void main(String[] args) {

/*
 * Continue : if I want to skip any values
 * 
 *  Break   : is used the end the loop
 */
// for(int i=1 ; i<6; i++) {
//	 
//	 if (i==3||i==5) {
//		 continue;
//	 }
//	 System.out.println(i+" ");
// }
 
 
 /*
  * Ask user to enter an integer and print  them until ten
  */
 Scanner scan = new Scanner(System.in);
 
 
 do {
	 	 System.out.println();
	 	 int num = scan.nextInt();
	 	 if(num==10) {
	 		 break;
	 	 }else {
	 		 System.out.println(num + "");
	 	 }
 }while(true);
 
 System.out.println("You stopped the by Break!!");

	}

}
