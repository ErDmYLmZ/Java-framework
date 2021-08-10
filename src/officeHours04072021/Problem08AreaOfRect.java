package officeHours04072021;

import java.util.Scanner;

public class Problem08AreaOfRect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one side of the Rectengle..");
		int sside = scan.nextInt();
		System.out.println("Please enter the second side of the Rectengle..");
		int lside = scan.nextInt();
		
		System.out.println("The area of the rectengle is "+ (lside*sside)+ " and the perimeter is "+ (2*(lside+sside)));
		
		scan.close();

	}

}
