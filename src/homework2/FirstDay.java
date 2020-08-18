package homework2;

public class FirstDay {
	public static int getfirstday(int year){
		int month = 1,day = 1;//to determine the weekday of the first day of the year 
		while(true) {
			//use zeller formula
			year--;// the Jan should -1 ,follow the formula.
			month+=12;
			int c=year/100;
			int y=year-c*100;
			int weekday=y+y/4+c/4-2*c+26*(month+1)/10+day-1;
			while(weekday<0) {
				weekday+=7;
				weekday %=7;
			}
			return weekday;
		}
	}

	
}
