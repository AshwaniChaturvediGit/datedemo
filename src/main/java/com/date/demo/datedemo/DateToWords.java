package com.date.demo.datedemo;
import java.util.Scanner;

public class DateToWords{
	
	public static void main(String[] args) {
					
		Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Date in dd-mm-yyyy hh:mm:ss AM/PM format\n"); 
            
        String str= userInput.nextLine();     
       
    //    str="30-11-2021 10:14:15 AM"; // comments it if want to enter the date time
        
        if(str!=null && !"".equals(str)){
	        String strDate = str.substring(0,10);
	        String strDateArr[] = strDate.split("-");
	        int day = Integer.parseInt(strDateArr[0]);
	        int month = Integer.parseInt(strDateArr[1]);
	        int year = Integer.parseInt(strDateArr[2]);
	        
	        String strTime = str.substring(11,19);
	        String strTimeArr[] = strTime.split(":");
	        int hh = Integer.parseInt(strTimeArr[0]);
	        int mm = Integer.parseInt(strTimeArr[1]);
	        int ss = Integer.parseInt(strTimeArr[2]);
	        
	        String strAMPM = str.substring(20,22);
	        
	        System.out.println("You Have Entered Date: "+strDate + " Time : " + strTime + " " + strAMPM );
	      
	        userInput.close();
	         
	        if(month > 12 || month < 1 || day > 31 || day < 1)
		    {
	        	System.out.println("ERROR : Date Is Not Valid !");
		    }else{
		    	PrintDateService.printDate(day,month,year);
		    	DayCalculator.getDayName(day,month,year);
		    }
	        
	        TimeCalculatar.printTimeWords(hh, mm, ss, strAMPM);
        }else{
        	System.out.println("ERROR : Date Is Not Valid !");
        }
	}	

}