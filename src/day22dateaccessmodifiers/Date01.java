package day22dateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		
		//How to create date object
		
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate1);
		
		currentDate1.plusDays(8);//2021-07-13
		System.out.println(currentDate1.plusDays(8));//2021-07-21
		
		currentDate1.plusMonths(2);
		System.out.println(currentDate1.plusMonths(2));//2021-09-13
		
		currentDate1.plusYears(5);
		System.out.println(currentDate1.plusYears(5));//2026-07-13
		
		currentDate1.plusDays(-12);
		System.out.println(currentDate1.plusDays(-12));//2021-07-01
	
		
		//chain method
		currentDate1.plusDays(4).plusMonths(3).plusYears(2);
		System.out.println(currentDate1.plusDays(4).plusMonths(3).plusYears(2));//2023-10-17
	
		currentDate1.getYear();
		System.out.println(currentDate1.getYear()); //2021
	
		currentDate1.getMonth();
		System.out.println(currentDate1.getMonth()); //JULY
	
		currentDate1.getMonthValue();
		System.out.println(currentDate1.getMonthValue()); // 7
	
		currentDate1.getDayOfMonth();
		System.out.println(currentDate1.getDayOfMonth()); //13
	
		currentDate1.getDayOfWeek();
		System.out.println(currentDate1.getDayOfWeek()); //TUESDAY
	
		currentDate1.plusWeeks(2);
		System.out.println(currentDate1.plusWeeks(2)); //2021-07-27
	
		currentDate1.minusDays(10);
		System.out.println(currentDate1.minusDays(10)); //2021-07-03
	
	    //Comparison
		
		LocalDate date2 = LocalDate.of(2020, 8, 10);
	
		currentDate1.isAfter(date2);
		System.out.println(currentDate1.isAfter(date2)); //true
	
		currentDate1.isBefore(date2);
		System.out.println(currentDate1.isBefore(date2)); //false
		
		//LocalDateTime
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1); //2021-07-13T01:46:43.134477500
		
		//Changing the format
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);//2021-07-13
		
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		dtformat1.format(currentDate2);
		System.out.println(dtformat1.format(currentDate2)); // MMMM ==>13/July/21
															// MMM  ==>13/Jul/21  
														   	// MM   ==>13/07/21  
														   	// M    ==>13/7/21
															// MMMMM==>13/J/21
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);//02:05:41.712709500
		
		DateTimeFormatter dtformat2 = DateTimeFormatter.ofPattern("HH:mm");
		
		
		System.out.println(dtformat2.format(currentTime1)); // hh:mm ==> 02:11  HH:mm ==> 14:11
		
		// How to find the difference of two dates
		
		LocalDate d1 = LocalDate.now();
		
		LocalDate d2 = LocalDate.of(1981, 8, 13);
		
		// It returns Year, Month and Days
		Period age = Period.between(d1, d2);
		System.out.println(age); //P-39Y-11M
		
		// If I want to get just the year
		
		int ageYear = Period.between(d2, d1).getYears();
		System.out.println(ageYear); //39
		
		
		
		
		
		
		
		
	
	}

}
