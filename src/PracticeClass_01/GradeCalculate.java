package PracticeClass_01;

import java.util.Scanner;

public class GradeCalculate {

	public static void main(String[] args) {
		/* Write a program and calculate grade of three exams with the given values
		 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 EXAMPLE: INPUT : Math=70
		 * Science=60 Chemistry=89 A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
		 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Math grade");
		int mathGrade = scanner.nextInt();
		System.out.println(mathGrade>=90 && mathGrade<=90  ? "Mathgrade is A" : mathGrade >=80 && mathGrade <=89 ? "Math Grade is B" : mathGrade>=70 && mathGrade<=79 ? "Math Grade is C" : mathGrade >=60 && mathGrade<=69 ? "Math Grade is D" : mathGrade >=0 && mathGrade <=59 ? "Math Grade is F" : "Wrong Grade");
		
			
		
		System.out.println("Please enter your Science grade");
		int scienceGrade = scanner.nextInt();
		System.out.println(scienceGrade>=90 && mathGrade<=90  ? "Science is A" : scienceGrade >=80 && scienceGrade <=89 ? "Science Grade is B" : scienceGrade>=70 && scienceGrade<=79 ? "Science Grade is C" : scienceGrade >=60 && scienceGrade<=69 ? "Science Grade is D" : scienceGrade >=0 && scienceGrade <=59 ? "Science Grade is F" : "Wrong Grade");
		
		
		System.out.println("Please enter your Chemistry grade");
		int chemistryGrade = scanner.nextInt();
		System.out.println(chemistryGrade>=90 && chemistryGrade<=90  ? "Chemistry is A" : chemistryGrade >=80 && chemistryGrade <=89 ? "Chemistry Grade is B" : chemistryGrade>=70 && chemistryGrade<=79 ? "Chemistry Grade is C" : chemistryGrade >=60 && chemistryGrade<=69 ? "Chemistry Grade is D" :chemistryGrade >=0 && chemistryGrade <=59 ? "Chemistry Grade is F" : "Wrong Grade");
		
		
		
		
	}

}
