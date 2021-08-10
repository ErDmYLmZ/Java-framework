package personalStudy;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number:");
    int num1 = scanner.nextInt();
    int num3=num1;
    System.out.print("Enter second number:");
    int num2 =scanner.nextInt();
    int num4 =num2;		         
   		 scanner.close();
		while (num1 != num2) {
		        	if(num1 > num2)
		                num1 = num1 - num2;
		            else
		                num2 = num2 - num1;
		        }
		        System.out.println("GCD for "+ num3 +" and "+ num4 +" = " + num2);
		        		
		  
		
		int lcm = (num3 > num4) ? num3 : num4;
		       
		        while(true) 
		        {
		           if( lcm % num3 == 0 && lcm % num4 == 0 ) 
		           {
		               System.out.printf("LCM for "+num3+" and " +num4+" = " + lcm);
		               break;
		            }
		         ++lcm;
		        } 
		  }
 }
		

	
	


