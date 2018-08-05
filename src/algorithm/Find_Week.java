package algorithm;

import java.awt.List;
import java.util.Calendar;
import java.util.Locale;

class Solution {
	  public String solution(int a, int b) {
		  int [] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
		  String[] str = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	      int sum=0;
		  for(int i = 0 ;i < a-1 ;i++) {
	    	  sum +=arr[i];
	      }
	      return str[(sum + b)%7];
	  }
	  
	  public String getDayName(int month, int day)
	    {
	        Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
	                        .setDate(2016, month - 1, day).build();
	        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	    }
	  
	  
	  
	  public String dayName(int a, int b)
	    {
	      String answer = "";
	      switch(a) {
	        case 1:
	          if(b % 7 == 1)
	            answer = "FRI";
	          else if(b % 7 == 2)
	            answer = "SAT";
	          else if(b % 7 == 3)
	            answer = "SUN";
	          else if(b % 7 == 4)
	            answer = "MON";
	          else if(b % 7 == 5)
	            answer = "TUE";
	          else if(b % 7 == 6)
	            answer = "WED";
	          else
	            answer = "THU";
	          break;
	        case 2:
	          if(b % 7 == 1)
	            answer = "MON";
	          else if(b % 7 == 2)
	            answer = "TUE";
	          else if(b % 7 == 3)
	            answer = "WED";
	          else if(b % 7 == 4)
	            answer = "THU";
	          else if(b % 7 == 5)
	            answer = "FRI";
	          else if(b % 7 == 6)
	            answer = "SAT";
	          else
	            answer = "SUN";
	          break;
	        case 3:
	          if(b % 7 == 1)
	            answer = "TUE";
	          else if(b % 7 == 2)
	            answer = "WED";
	          else if(b % 7 == 3)
	            answer = "THU";
	          else if(b % 7 == 4)
	            answer = "FRI";
	          else if(b % 7 == 5)
	            answer = "SAT";
	          else if(b % 7 == 6)
	            answer = "SUN";
	          else
	            answer = "MON";
	          break;
	        case 4:
	          if(b % 7 == 1)
	            answer = "THU";
	          else if(b % 7 == 2)
	            answer = "FRI";
	          else if(b % 7 == 3)
	            answer = "SAT";
	          else if(b % 7 == 4)
	            answer = "SUN";
	          else if(b % 7 == 5)
	            answer = "MON";
	          else if(b % 7 == 6)
	            answer = "TUE";
	          else
	            answer = "WED";
	          break;  
	        case 5:
	            if(b % 7 == 1)
	            answer = "SUN";
	          else if(b % 7 == 2)
	            answer = "MON";
	          else if(b % 7 == 3)
	            answer = "TUE";
	          else if(b % 7 == 4)
	            answer = "WED";
	          else if(b % 7 == 5)
	            answer = "THU";
	          else if(b % 7 == 6)
	            answer = "FRI";
	          else
	            answer = "SAT";
	          break;
	        case 6:
	            if(b % 7 == 1)
	            answer = "WED";
	          else if(b % 7 == 2)
	            answer = "THU";
	          else if(b % 7 == 3)
	            answer = "FRI";
	          else if(b % 7 == 4)
	            answer = "SAT";
	          else if(b % 7 == 5)
	            answer = "SUN";
	          else if(b % 7 == 6)
	            answer = "MON";
	          else
	            answer = "TUE";
	          break;
	        case 7:
	            if(b % 7 == 1)
	            answer = "FRI";
	          else if(b % 7 == 2)
	            answer = "SAT";
	          else if(b % 7 == 3)
	            answer = "SUN";
	          else if(b % 7 == 4)
	            answer = "MON";
	          else if(b % 7 == 5)
	            answer = "TUE";
	          else if(b % 7 == 6)
	            answer = "WED";
	          else
	            answer = "THU";
	          break;
	        case 8:
	            if(b % 7 == 1)
	            answer = "MON";
	          else if(b % 7 == 2)
	            answer = "TUE";
	          else if(b % 7 == 3)
	            answer = "WED";
	          else if(b % 7 == 4)
	            answer = "THU";
	          else if(b % 7 == 5)
	            answer = "FRI";
	          else if(b % 7 == 6)
	            answer = "SAT";
	          else
	            answer = "SUN";
	          break;
	        case 9:
	            if(b % 7 == 1)
	            answer = "THU";
	          else if(b % 7 == 2)
	            answer = "FRI";
	          else if(b % 7 == 3)
	            answer = "SAT";
	          else if(b % 7 == 4)
	            answer = "SUN";
	          else if(b % 7 == 5)
	            answer = "MON";
	          else if(b % 7 == 6)
	            answer = "TUE";
	          else
	            answer = "WED";
	          break;
	        case 10:
	            if(b % 7 == 1)
	            answer = "SAT";
	          else if(b % 7 == 2)
	            answer = "SUN";
	          else if(b % 7 == 3)
	            answer = "MON";
	          else if(b % 7 == 4)
	            answer = "TUE";
	          else if(b % 7 == 5)
	            answer = "WED";
	          else if(b % 7 == 6)
	            answer = "THU";
	          else
	            answer = "FRI";
	          break;
	        case 11:
	            if(b % 7 == 1)
	            answer = "TUE";
	          else if(b % 7 == 2)
	            answer = "WED";
	          else if(b % 7 == 3)
	            answer = "THU";
	          else if(b % 7 == 4)
	            answer = "FRI";
	          else if(b % 7 == 5)
	            answer = "SAT";
	          else if(b % 7 == 6)
	            answer = "SUN";
	          else
	            answer = "MON";
	          break;
	        case 12:
	            if(b % 7 == 1)
	            answer = "THU";
	          else if(b % 7 == 2)
	            answer = "FRI";
	          else if(b % 7 == 3)
	            answer = "SAT";
	          else if(b % 7 == 4)
	            answer = "SUN";
	          else if(b % 7 == 5)
	            answer = "MON";
	          else if(b % 7 == 6)
	            answer = "TUE";
	          else
	            answer = "WED";
	          break;
	        }
	        return answer;
	    }
	}

public class Find_Week {
	public static void main(String[] args) {
		Solution su = new Solution();
		
		long start = System.currentTimeMillis();
		for(int i =0 ; i <10000000;i++) su.solution(12, 1);
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0f);
		
		long start1 = System.currentTimeMillis();
		for(int i =0 ; i <10000000;i++) su.solution(12, 1);
		long end1 = System.currentTimeMillis();
		System.out.println((end1-start1)/1000.0f);
		
		
		long start2 = System.currentTimeMillis();
		for(int i =0 ; i <10000000;i++) su.dayName(12, 1);
		long end2 = System.currentTimeMillis();
		System.out.println((end2-start2)/1000.0f);
		
	}
}
