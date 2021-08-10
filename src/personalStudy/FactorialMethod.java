package personalStudy;

import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter an integer..");
	int a=scan.nextInt();
	
	fact(a);
	
	}
	
public static void fact(int a) {
	int fac=1;
	for(int i=a; i>=1; i--) {
		fac=fac*i;
	}System.out.println(a+"!="+"6*5*4*3*2*1="+fac);
	


}//6!=6*5*4*3*2*1=720
}