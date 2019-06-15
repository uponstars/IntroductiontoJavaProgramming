import java.util.Scanner;

public class Chapter4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String str = input.next();
		
		if (str.length() != 11) {
			System.out.println(str + " is an invalid social security number");
			System.exit(0);
		}
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		char ch4 = str.charAt(3);
		char ch5 = str.charAt(4);
		char ch6 = str.charAt(5);
		char ch7 = str.charAt(6);
		char ch8 = str.charAt(7);
		char ch9 = str.charAt(8);
		char ch10 = str.charAt(9);
		char ch11 = str.charAt(10);
		
		if (Character.isDigit(ch1)
			&& Character.isDigit(ch2)
			&& Character.isDigit(ch3)
			&& ch4 == '-'
			&& Character.isDigit(ch5)
			&& Character.isDigit(ch6)
			&& ch7 == '-'
			&& Character.isDigit(ch8)
			&& Character.isDigit(ch9)
			&& Character.isDigit(ch10)
			&& Character.isDigit(ch11)) {
				System.out.println(str + " is a valid social security number");
		}
		else
			System.out.println(str + " is an invalid social security number");
	}
}