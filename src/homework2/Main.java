package homework2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("====================================================="
				+ "\nHello!,This program written by xieronghai can achieve "
				+ "\n1:CalenadarPrint"
				+ "\n2:transform your date "
				+ "to weekday.");
		/**
		 * catch specific date month year 
		 */
		System.out.println();
		System.out.println();
		System.out.println("This is the first function");
		//get year
		System.out.println("Now,please type year.");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		Print p=new Print();
		p.printCal(year);
		
		System.out.println();
		System.out.println("This is the second function");
		//get the year2
		System.out.println("Firstly,please type in the year");
		int year2 =sc.nextInt();
		//get month
		System.out.println("Secondly,please type in month");
		int month=sc.nextInt();
				
		//get date
		System.out.println("Last,please type in date");
		int date=sc.nextInt();
		sc.close();
		
		Weekday.judgeWeekday(year2,month,date);
	}
}

