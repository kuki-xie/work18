package homework3.Calendar;

import java.util.Calendar;
import java.util.Date;

public class JudgeWeekday {
    public static String chooseWeekday(int i){
        //Make table
        String[] arr={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return arr[i-1];
    }

    public static void getWeekday(Date pa){
        //Create Calendar object to Set Time
        Calendar cal=Calendar.getInstance();
        cal.setTime(pa);
        //Judge the weekday and print
        int i=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("The date is "+chooseWeekday(i));
    }
}
