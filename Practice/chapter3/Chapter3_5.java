import java.util.Scanner;

public class Chapter3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		int day = today + daysElapsed;
		
		if (today == 0) {
			switch (day % 7) {
				case 0: System.out.println("Today is Sunday and the future day is Sunday");break;
				case 1: System.out.println("Today is Sunday and the future day is Monday");break;
				case 2: System.out.println("Today is Sunday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Sunday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Sunday and the future day is Thursday");break;
				case 5: System.out.println("Today is Sunday and the future day is Friday");break;
				case 6: System.out.println("Today is Sunday and the future day is Saturday");break;
			}
		}
		else if (today == 1) {
			switch (day % 7) {
				case 0: System.out.println("Today is Monday and the future day is Sunday");break;
				case 1: System.out.println("Today is Monday and the future day is Monday");break;
				case 2: System.out.println("Today is Monday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Monday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Monday and the future day is Thursday");break;
				case 5: System.out.println("Today is Monday and the future day is Friday");break;
				case 6: System.out.println("Today is Monday and the future day is Saturday");break;
			}
		}
		else if (today == 2) {
			switch (day % 7) {
				case 0: System.out.println("Today is Tuesday and the future day is Sunday");break;
				case 1: System.out.println("Today is Tuesday and the future day is Monday");break;
				case 2: System.out.println("Today is Tuesday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Tuesday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Tuesday and the future day is Thursday");break;
				case 5: System.out.println("Today is Tuesday and the future day is Friday");break;
				case 6: System.out.println("Today is Tuesday and the future day is Saturday");break;
			}
		}
		else if (today == 3) {
			switch (day % 7) {
				case 0: System.out.println("Today is Wednesday and the future day is Sunday");break;
				case 1: System.out.println("Today is Wednesday and the future day is Monday");break;
				case 2: System.out.println("Today is Wednesday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Wednesday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Wednesday and the future day is Thursday");break;
				case 5: System.out.println("Today is Wednesday and the future day is Friday");break;
				case 6: System.out.println("Today is Wednesday and the future day is Saturday");break;
			}
		}
		else if (today == 4) {
			switch (day % 7) {
				case 0: System.out.println("Today is Thursday and the future day is Sunday");break;
				case 1: System.out.println("Today is Thursday and the future day is Monday");break;
				case 2: System.out.println("Today is Thursday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Thursday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Thursday and the future day is Thursday");break;
				case 5: System.out.println("Today is Thursday and the future day is Friday");break;
				case 6: System.out.println("Today is Thursday and the future day is Saturday");break;
			}
		}
		else if (today == 5) {
			switch (day % 7) {
				case 0: System.out.println("Today is Friday and the future day is Sunday");break;
				case 1: System.out.println("Today is Friday and the future day is Monday");break;
				case 2: System.out.println("Today is Friday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Friday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Friday and the future day is Thursday");break;
				case 5: System.out.println("Today is Friday and the future day is Friday");break;
				case 6: System.out.println("Today is Friday and the future day is Saturday");break;
			}
		}
		else if (today == 6) {
			switch (day % 7) {
				case 0: System.out.println("Today is Saturday and the future day is Sunday");break;
				case 1: System.out.println("Today is Saturday and the future day is Monday");break;
				case 2: System.out.println("Today is Saturday and the future day is Tuesday");break;
				case 3: System.out.println("Today is Saturday and the future day is Wednesday");break;
				case 4: System.out.println("Today is Saturday and the future day is Thursday");break;
				case 5: System.out.println("Today is Saturday and the future day is Friday");break;
				case 6: System.out.println("Today is Saturday and the future day is Saturday");break;
			}
		}
	}
}