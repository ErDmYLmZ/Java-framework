package day22dateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01EK {

	public static void main(String[] args) {
	LocalDate currentDate = LocalDate.now();
	System.out.println("Yesterday is "+currentDate.minusDays(1));
	//LocalDate currentDate = LocalDate.now();
	System.out.println("Tomorrow is "+currentDate.plusDays(1));
	
	//Method chaining
	System.out.println("Result is "+currentDate.plusYears(2).plusMonths(3).plusDays(15));
	
	System.out.println("Result is "+currentDate.minusMonths(5).minusDays(27));
	
	//How to get year only
	System.out.println(currentDate.getYear()); //2021
	
	//how to print the value of month
	System.out.println(currentDate.getMonthValue()); //7
	System.out.println(currentDate.getMonth()); //JULY
	
	//get the day
	System.out.println(currentDate.getDayOfMonth()); //15
	System.out.println(currentDate.getDayOfYear()); //196
	System.out.println(currentDate.getDayOfWeek()); //THURSDAY
	
	// to create a specific date
	LocalDate date1 = LocalDate.of(1981, 8, 13);
	System.out.println(date1); // 1995-03-03
	System.out.println(date1.getDayOfWeek()); //THURSDAY
	
	// compare 2 dates
	System.out.println(currentDate.isAfter(date1)); //true
	System.out.println(currentDate.isBefore(date1)); //false
	
	
	
	// changing the format from "yyyy-MM-dd" to different format
	// Do not use mm for Month!! mm refers to "minute"
	
	LocalDate currentDate1 = LocalDate.now();
	System.out.println(currentDate1);
	
	//to format our date we use DateTime Formatter
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	System.out.println("after formatting: "+ dateTimeFormatter.format(currentDate1));//15/Jul/2021
	
	DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("after formatting: "+ dateTimeFormatter1.format(currentDate1));//15/07/2021
	
	DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/M/yyyy");
	System.out.println("after formatting: "+ dateTimeFormatter2.format(currentDate1));//15/7/2021
	
	DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yy");
	System.out.println("after formatting: "+ dateTimeFormatter3.format(currentDate1)); //15/07/21
	
	
	System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3)));//15/10/21
	System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3).plusDays(11)));//26/10/21
	
	LocalTime currentTime = LocalTime.now();
	System.out.println(currentTime);//17:05:52.587241700
	
	DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");
	System.out.println(timeFormatter.format(currentTime)); //05:09
	
	DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println(timeFormatter1.format(currentTime)); //17:12
	
	DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("hh:mm a");
	System.out.println(timeFormatter2.format(currentTime)); //05:12 PM
	
	//how to get the difference between two dates
	LocalDate d1 = LocalDate.now();
	LocalDate d2 = LocalDate.of(1992, 3, 27);
	
	Period muhammedsAge = Period.between(d2, d1);
	System.out.println(muhammedsAge); //P29Y3M18D

	int age = Period.between(d2, d1).getYears();
	System.out.println(age);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
