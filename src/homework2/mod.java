package homework2;

public class mod {
	public static void main(String[] args) {
		int weekday=-104;
		while(weekday<0) {
			weekday += 7;
			weekday %=7;
		}
		System.out.println(weekday);
	}
}