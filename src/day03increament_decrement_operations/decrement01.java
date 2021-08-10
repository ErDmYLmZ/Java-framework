package day03increament_decrement_operations;

public class decrement01 {

	public static void main(String[] args) {
		
		int num=100;
		
		//how to decrease the value by variable by substraction

		// 1.way
		num=num-5;
		
		System.out.println("new value= "+ num);
		// 2.way
		
		num-=5;
		
		// 3.way--> only decrease 1
		num--;
		
		
		//how to decrease the value by division
		int salary= 5000;
		
		//1.way
		salary = salary / 5;
		System.out.println("final is " + salary);
		
		//2.way
		salary /=5;
		System.out.println("final is "+ salary);
		
		
		
		double aliSalary = 600;
		double veliSalary = 500;
		
		
	     // if we have started with int, it would be as below
		// int aliSalary = 600;
		// int velisalary = 500;
		
		// aliSalary = (int)(aliSalary * 0.8); --> explicit action
		// alisalary += 100;
		
		// veliSalary +=100;
		// veliSalary = (int)(veliSalary * 0.8); --> explicit action
		
	
		
		aliSalary *=0.8;
		aliSalary +=100;
		
		veliSalary +=100;
		veliSalary *=0.8;
		
		System.out.println("Ali's final salary is "+aliSalary );
		System.out.println("Veli's final salary is "+veliSalary);
		
	}

}
