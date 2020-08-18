package homework2;

public class Weekday {
	public static void judgeWeekday(int year,int month,int day){
		if (month==1||month==2) {// the January & February belonged to the former year follow the formula
			year--;
			month+=12;
		}
		int c=year/100;
		int y=year-c*100;
		int weekday= y +y / 4 + c / 4 - 2 * c + 26 * (month + 1) / 10 + day - 1;
		while(weekday<0) {
			weekday +=7;
			weekday %=7;//对负数的取模运算
		}
		switch(weekday) {
		case 1:System.out.println("Monday\n");break;
		case 2:System.out.println("Tuesday\n");break;
		case 3:System.out.println("Wednesday\n");break;
		case 4:System.out.println("Thursday\n");break;
		case 5:System.out.println("Friday\n");break;
		case 6:System.out.println("Saturday\n");break;
		case 7:System.out.println("Sunday\n");break;
		}
	}

}
