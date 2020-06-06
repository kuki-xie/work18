package homework3.Calendar;

import java.util.Calendar;

public class PrintCalendar {
    public static void print(int year) {
        Calendar cal = Calendar.getInstance();

        int month=1;
        while(month<=12) {
        /*set the date,and the true month =month  -1
        because the java starts at 0
         */
            cal.set(year, month-1 , 1);
            //get the weekday of the start day of the month
            int startDay = cal.get(Calendar.DAY_OF_WEEK);
            int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int count = startDay - 1;//The Days of the first week

            //start to print
            System.out.println(month + "月");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            space(startDay);
            for (int i = 1; i <= endDay; i++) {
                System.out.printf("%3d%s", i, " ");
                count++;
                if (count >= 7) {
                    count = 0;
                    System.out.print('\n');
                }
            }
            month++;
            System.out.println();
        }
    }
    public static void space(int startDay) {
        for (int i = 1; i < startDay; i++) {
            System.out.printf("%4s", " ");
        }
    }
}
