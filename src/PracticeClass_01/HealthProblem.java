package PracticeClass_01;

import java.util.Scanner;

public class HealthProblem {

	public static void main(String[] args) {
       
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, the other option is obese
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Name");
		String name = scan.next();
		
		System.out.println("Please enter your Surname");
		String surname = scan.next();
		
		System.out.println("Please enter your age");
		int age= scan.nextInt();
		
		System.out.println("Please enter your Weight");
		double weight = scan.nextDouble();
		
		System.out.println("Please enter your Height");
		double height = scan.nextDouble();
		
		double bmi = weight / (height * height/10000);
		
		String status;
		if (bmi<=20) {
			status = "weak";
		}else if (bmi<=25) {
			status = "healty";
		}else if(bmi<=30) {
			status = "fat";
			
		}else
			status = "Obese";
		
		System.out.println(name + " " + surname + "is" + age + "years old his height is" + height + "and his weight is " + weight + "." + "His status is " + status + "due to his bmi " + bmi);
		
		
		
		/*String fullName =scan.nextLine().toLowerCase();
		
		System.out.println("enter you age");
		int age =scan.nextInt();
		
		System.out.println("enter you weight");
		double weight = scan.nextInt();
		System.out.println("enter your height");
		double height = scan.nextInt();
		
		double bmi=0;
		
		bmi = weight/(height *height*1000);
		
		
		
		 System.out.println(fullName+" "+ bmi);
        */
	}

}
