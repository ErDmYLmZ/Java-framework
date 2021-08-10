package personalStudy;

import java.util.Scanner;

public class ReplitIf_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your weight(kg).. ");
		double weight = scan.nextDouble();
		System.out.println("Please enter your height(m)..");
		double height = scan.nextDouble();
		
		double bmi = weight/(height*height/10000);
		
		if(bmi<=18.5) {
			System.out.println("You are weak");
			}else if(18.5<bmi&&bmi<25) {
				System.out.println("your weight is ideal");
			}else if(bmi>=25 && bmi<30) {
				System.out.println("You are fat");
			}else {
				System.out.println("obese");
			}

	}

}
