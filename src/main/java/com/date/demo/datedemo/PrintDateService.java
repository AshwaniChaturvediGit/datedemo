package com.date.demo.datedemo;

public class PrintDateService {

	String tmpStr;
	String st1[] = { "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN",	"EIGHT", "NINE", };
	String st2[] = { "HUNDRED", "THOUSAND"};
	String st3[] = { "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",	"FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINTEEN", };
	String st4[] = { "TWENTY", "THIRTY"};
	
	public static void printDate(int day,int month,int year){
		PrintDateService dateService = new PrintDateService();
		System.out.println("Valid Date : "
			+ ""+dateService.convert(day)+" "+dateService.getMonthName(month)+" "+dateService.convert(year));
	
	}
	private String convert(int number){
		int n = 1;
		int word;
		tmpStr = "";
		while (number != 0) {
			switch (n) {
				case 1:
					word = number % 100;
					pass(word);
					if (number > 100 && number % 100 != 0) {
				//	show("and ");
					}
					number /= 100;
					break;
				
				case 2:
					word = number % 10;
					if (word != 0) {
					show(" ");
					show(st2[0]);
					show(" ");
					pass(word);
					}
					number /= 10;
					break;
				
				case 3:
					word = number % 100;
					if (word != 0) {
					show(" ");
					show(st2[1]);
					show(" ");
					pass(word);
					}
					number /= 100;
					break;
				
				case 4:
					word = number % 100;
					if (word != 0) {
					show(" ");
					show(st2[2]);
					show(" ");
					pass(word);
					}
					number /= 100;
					break;
				
				case 5:
					word = number % 100;
					if (word != 0) {
					show(" ");
					show(st2[3]);
					show(" ");
					pass(word);
					}
					number /= 100;
					break;
			
			}
			n++;
		}
		return tmpStr;
	}

	private void pass(int number) {
		int word, q;
		if (number < 10) {
			show(st1[number]);
		}
		if (number > 9 && number < 20) {
			show(st3[number - 10]);
		}
		if (number > 19) {
			word = number % 10;
			if (word == 0) {
				q = number / 10;
				show(st4[q - 2]);
			} else {
				q = number / 10;
				show(st1[word]);
				show(" ");
				show(st4[q - 2]);
		}
		}
	}
	private void show(String s) {
		String st;
		st = tmpStr;
		tmpStr = s;
		tmpStr += st;
	}

	private String getMonthName(int month){
		String[] name = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
	            "OCTOBER", "NOVEMBER", "DECEMBER"};
	    
	    return name[month-1];
	}
	
}
