package day16statickeyword;

import java.util.Scanner;

public class StudentsRunnerEKeskin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		do {
			
		
		System.out.println("please enter your first name..");
		String firstName = scan.next();
		System.out.println("please enter your last name..");
		String lastName = scan.next();
		String name=firstName+" "+ lastName;
		System.out.println("please enter your grade..");
		int grade = scan.nextInt();
		System.out.println("please enter your year..");
		int year = scan.nextInt();
		
		
		StudentsEKeskin student1 = new StudentsEKeskin("name", grade, year);
		//we commented out this method to call it from constructor. It will make our code more clear.
		//student1.setId();
		System.out.println("Student1 id: "+ student1.id);
		System.out.println("Student1 name: "+student1.name);
		System.out.println("Student1 grade: "+student1.grade);
		System.out.println("Student1 year: "+student1.year);
		//StudentsEKeskin student2 = new StudentsEKeskin("Veli Han", 5, 2020);
		//student2.setId();
		//System.out.println("Student2 id: "+ student2.id);
	System.out.println("to quit press Q, to continue press any key");
	String quit=scan.next().toUpperCase();
	if(quit.equals("Q")) {
		System.out.println("exit succesfully");
		break;
	}
		}while(true);
	 
	System.out.println("Thanks for choosing us! see you later!..");
	

		
	}
}
