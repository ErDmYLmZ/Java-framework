package officeHours04072021;

import java.util.Scanner;

public class Problem05PrimitiveDataTypes {

	public static void main(String[] args) {
		//ask user to enter 8 primitive data and print on the console
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a data in byte data type");
		byte byt = scan.nextByte();
		System.out.println("User entered "+byt+ " as Byte");
		System.out.println();
		
		System.out.println("Please enter a data in short data type");
		short shrt = scan.nextShort();
		System.out.println("User entered "+shrt+ " as Short");
		System.out.println();
		
		System.out.println("Please enter a data in int data type");
		int in = scan.nextInt();
		System.out.println("User entered "+in+ " as Integer");
		System.out.println();
		
		System.out.println("Please enter a data in long data type");
		long lng = scan.nextLong();
		System.out.println("User entered "+lng+ " as Long");
		System.out.println();
		
		System.out.println("Please enter a data in float data type");
		float flt = scan.nextFloat();
		System.out.println("User entered "+flt+"f"+ " as Float");
		System.out.println();
		
		System.out.println("Please enter a data in double data type");
		double dbl = scan.nextDouble();
		System.out.println("User entered "+dbl+ " as Double");
		System.out.println();
		
		System.out.println("Please enter a data in boolean data type");
		boolean bln = scan.nextBoolean();
		System.out.println("User entered "+bln+ " as Boolean");
		System.out.println();
		
		System.out.println("Please enter a data in char data type");
		String chr = scan.next();
		System.out.println("User entered "+chr+ " as Char");
		
		
		
		scan.close();
		
		
		
		
		
	}

}
