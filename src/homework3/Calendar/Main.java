package homework3.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Create Scanner object to read the date
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Judge the date");
        System.out.println("Input year");
        String year=sc.next();
        System.out.println("Input month");
        String month=sc.next();
        System.out.println("Input day");
        String day=sc.next();

        //transform the format
        SimpleDateFormat fmt=new SimpleDateFormat("yyyy MM dd");
        Date pa=fmt.parse(year+" "+month+" "+day);

        //judge the weekday
        JudgeWeekday.getWeekday(pa);
        System.out.println("========================");

        System.out.println("2.homework2.Print Calendar");
        System.out.println("Input the year");
        int year2=sc.nextInt();
        PrintCalendar.print(year2);
    }
}
