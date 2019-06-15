import java.util.Scanner;

public class Chapter4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String str = input.next();
		
		switch (str) {
			case "Jan": System.out.println(str + year + " has 31 days");break;
			case "Feb": if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
							System.out.println(str + year + " has 29 days");
						else
							System.out.println(str + year + " has 28 days");
						break;
			case "Mar": System.out.println(str + " " + year + " has 31 days");break;
			case "Apr": System.out.println(str + " " + year + " has 30 days");break;
			case "May": System.out.println(str + " " + year + " has 31 days");break;
			case "Jun": System.out.println(str + " " + year + " has 30 days");break;
			case "Jul": System.out.println(str + " " + year + " has 31 days");break;
			case "Aug": System.out.println(str + " " + year + " has 31 days");break;
			case "Sep": System.out.println(str + " " + year + " has 30 days");break;
			case "Oct": System.out.println(str + " " + year + " has 31 days");break;
			case "Nov": System.out.println(str + " " + year + " has 30 days");break;
			case "Dec": System.out.println(str + " " + year + " has 31 days");break;
		}
	}
}