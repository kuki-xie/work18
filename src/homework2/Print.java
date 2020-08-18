package homework2;

public class Print{

	public void printCal(int year) {
		
		int number=FirstDay.getfirstday(year); //the weekday of the first day of the year
		boolean is=JudgeLeap.judgeLeap(year); // in order to determine the year ? leap 
		int monthday;//the days of a month
		
		for (int i = 1; i <= 12; i++) { //the outer loop to print the 12 months
			System.out.println("                " + year + "年" + i + "月");
			// determine the days of every month
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				monthday = 31;
			else if (i == 2 && is)// the days of February when its not leap
				monthday = 28;
			else if (i == 2 && is == false)// the 29 days of February when its leap
				monthday = 29;
			else
				monthday = 30;
			
			/**
			 *  print tab
			 */
			System.out.println("------------------------------------------------------");
			// 5 space between Sun and Mon
			System.out.println("Sun     Mon     Tut     Wod     Thu     Fri     Sat ");
						
			for (int j = 1; j <= monthday; j++) {// j is the day of the month
				if (j == 1) {// when j is the first day		
					System.out.printf("%"+(number*8+1)+"d",j);// in order to match the Sun & Mon  
					if ((number + j) % 7 == 0) {// its the last day ,so line break
						System.out.println();
					} else // match the 7 space between Sun & Mon
						System.out.print("       ");
				} else {
					if ((number + j) % 7 == 0) {// it's a new day of a week
						System.out.println(j);
					} else {	
						if (j > 9)// its number >= 10 so its space is 6
							System.out.print(j + "      ");
						else // its number <10 so its space is 7
							System.out.print(j + "       ");
					}
				}

			}
			number = (number + monthday) % 7;// * to determine the weekday of the next month

			System.out.println();
			System.out.println("=======================================================");

		}
	}







}
