package com.date.demo.datedemo;

public class DayCalculator {

	
public static void getDayName(int day,int month,int year){
	 DayCalculator dayCalc = new DayCalculator();
	 int convertDay = dayCalc.monthToDay(month, day, year);
     convertDay += dayCalc.yearToDay(year);
     String today = dayCalc.calculateDay(convertDay);
     System.out.println("Day Of Week : " + today); // prints out what day it is
	
}
	
private int monthToDay(int month, int day, int year) { // converts months to number of days either 28,29,30,31
    int convertDay = 0, daysTo31 = 0;
    for (int i = 0, goMonth = month; i < month; i++) {
        if (goMonth == 1 || goMonth == 3 || goMonth == 5 || goMonth == 7 || goMonth == 8 || goMonth == 10 || goMonth == 12) {
      	  convertDay += 31;
      	  daysTo31 = 0;
        } else if (goMonth == 2) { // second month is February
            if (year % 4 != 0) {
                convertDay += 28;
                daysTo31 = 3;
            } else { // leap year
                convertDay += 29;
                daysTo31 = 2;
            }
        } else { // for months 4, 6, 9, 10
                convertDay += 30;
                daysTo31 = 1;
        }
        goMonth--;
    }
    convertDay -= (31 - day - daysTo31); // calculates days in the month
    return convertDay;
}

private int yearToDay(int year) { // converts years to number of days either 365 or 366
    int convertDay = 0;
    year -= 1601; // difference in years between the given year and 1601
    for (int i = 0, goYear = year; i < year; i++) {
        if (goYear == 100 || goYear == 200) { // century years are leap years, occurs twice
            convertDay +=  365;    
        } else if  (goYear % 4 == 0) {                           
            convertDay += 366;
        } else {
            convertDay += 365; // 366 days in a leap year
        }
        goYear--;
    }                                         
    return convertDay;
}	

private String calculateDay(int convertDay) { // does modulo with convertDay by numbers 1-7 to find the day of the week
	  if (convertDay % 7 == 1) {
	      return "Monday";
	  } else if (convertDay % 7 == 2) {
	      return "Tuesday";
	  } else if (convertDay % 7 == 3) {
	      return "Wednesday";
	  } else if (convertDay % 7 == 4) {
	      return "Thursday";
	  } else if (convertDay % 7 == 5) {
	      return "Friday";
	  } else if (convertDay % 7 == 6) {
	      return "Saturday";
	  } else if (convertDay % 7 == 0) {
	      return "Sunday";
	      }
	  return null;
}	

}
