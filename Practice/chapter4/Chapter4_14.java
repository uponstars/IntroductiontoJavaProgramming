import java.util.Scanner;

public class Chapter4_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String str = input.next();
		char ch = str.charAt(0);
		
		if ((ch >= 'A' && ch <= 'D') || ch == 'F' || ch == 'f' || (ch >= 'a' && ch <= 'd')) {
			switch (ch) {
				case 'a':
				case 'A': System.out.println("The numeric value for grade " + ch + " is 4");break;
				case 'b':
				case 'B': System.out.println("The numeric value for grade " + ch + " is 3");break;
				case 'c':
				case 'C': System.out.println("The numeric value for grade " + ch + " is 2");break;
				case 'd':
				case 'D': System.out.println("The numeric value for grade " + ch + " is 1");break;
				case 'f':
				case 'F': System.out.println("The numeric value for grade " + ch + " is 0");break;
			}
		}
		else
			System.out.println(ch + " is an invalid grade");
	}
}