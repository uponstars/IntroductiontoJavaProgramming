import java.util.Scanner;

public class Chapter2_7 {
	public static void main(String[] args) {
		final int YEAR_TO_DAY = 365;
		final int DAY_TO_HOUR = 24;
		final int HOUR_TO_MINUTE = 60;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		long days = minutes / (DAY_TO_HOUR * HOUR_TO_MINUTE);
		long years = days / YEAR_TO_DAY;
		long day = days % YEAR_TO_DAY;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + day + " days");
	}
}