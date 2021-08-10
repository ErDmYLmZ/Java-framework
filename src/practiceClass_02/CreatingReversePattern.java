package practiceClass_02;

import java.util.Scanner;

public class CreatingReversePattern {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number from 1-10..");
		int num = scan.nextInt();
		System.out.println("Please enter a symbol..");
		char sb = scan.next().charAt(0);
		
		for(int i=num; i>=0; i-=1) {
			
			for(int j= 0; j<num-i; j++) {
				System.out.print(" ");
				} for(int j=0; j<(i*2)-1;j++) {
					System.out.print(sb);
				}
			System.out.println();
			}
			
			
			
		}
			

	}


