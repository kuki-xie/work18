package homework2;
// in order to determine the year is or not leap
public class JudgeLeap {
	public static boolean judgeLeap(int year) {
		if((year%4==0 && year % 100 != 0)||(year % 400 == 0))
			return false;// leap
		else 
			return true;// not leap
	}
}
