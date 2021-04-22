package com.date.demo.datedemo;

public class TimeCalculatar {

	// Print Time in words.
    static void printTimeWords(int h, int m, int s, String strAMPM)
    {
        final String nums[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR","FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
        		"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
        		"EIGHTEEN", "NINETEEN", "TWENTY", "TWENTY ONE", "TWENTY TWO", "TWENTY THREE", "TWENTY FOUR",
        		"TWENTY FIVE", "TWENTY SIX", "TWENTY SEVEN", "TWENTY EIGHT", "TWENTY NINE", "THIRTY",
        		"THIRTY ONE","THIRTY TWO","THIRTY THREE","THIRTY FOUR","THIRTY FIVE","THIRTY SIX",
        		"THIRTY SEVEN","THIRTY EIGHT","THIRTY NINE","FORTY","FORTY ONE","FORTY TWO","FORTY THREE",
        		"FORTY FOUR","FORTY FIVE","FORTY SIX","FORTY SEVEN","FORTY EIGHT","FORTY NINE","FIFTY",
        		"FIFTY ONE","FIFTY TWO","FIFTY THREE","FIFTY FOUR","FIFTY FIVE","FIFTY SIX","FIFTY SEVEN",
        		"FIFTY EIGHT","FIFTY NINE" };
        
        System.out.print("Valid Time : ");
        if(h<=12 && m<60 && s<60){
        
	        if (m == 0)
	            System.out.print(nums[h] + " O' Clock ");
	      
	        else if (m == 1)
	            System.out.print("One Minute Past " + nums[h]);
	      
	        else if (m == 59)
	            System.out.print("One Minute To " + nums[(h % 12) + 1]);
	      
	        else if (m == 15)
	            System.out.print("Quarter Past " + nums[h]);
	      
	        else if (m == 30)
	            System.out.print("Half Past " + nums[h]);
	      
	        else if (m == 45)
	            System.out.print("Quarter To " + nums[(h % 12) + 1]);
	      
	        else if (m <= 30)
	            System.out.print( nums[m] + " Minutes Past " +  nums[h]);
	      
	        else if (m > 30)
	            System.out.print( nums[60 - m] + " Minutes To " +  nums[(h % 12) + 1]);
	        
	        if(s!=0){
	        	System.out.print(" And " + nums[s] + " Seconds -");
	        }
	        
	        if("AM".equals(strAMPM)){
	        	System.out.print(" Morning.");
	        } else if("PM".equals(strAMPM)){
	        	System.out.print(" Evening.");
	        }else{
	        	System.out.println("ERROR ! Please enter valid AM/PM !");
	        }
        
        }else{
        	System.out.println("ERROR ! Time Format Is Not Proper.");
        }
    }
	
	
}
