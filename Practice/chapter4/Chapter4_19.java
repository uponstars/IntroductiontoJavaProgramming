import java.util.Scanner;

public class Chapter4_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int d5 = 0;
		int d6 = 0;
		int d7 = 0;
		int d8 = 0;
		int d9 = 0;
		int d10 = 0;
		
		System.out.print("Enter the first 9 digits of an ISBN as string: ");
		String str = input.next();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		char ch4 = str.charAt(3);
		char ch5 = str.charAt(4);
		char ch6 = str.charAt(5);
		char ch7 = str.charAt(6);
		char ch8 = str.charAt(7);
		char ch9 = str.charAt(8);
		
		if (Character.isDigit(ch1)
			&& Character.isDigit(ch2)
			&& Character.isDigit(ch3)
			&& Character.isDigit(ch4)
			&& Character.isDigit(ch5)
			&& Character.isDigit(ch6)
			&& Character.isDigit(ch7)
			&& Character.isDigit(ch8)
			&& Character.isDigit(ch9)) {
			d1 = (int)ch1;
			d2 = (int)ch2;
			d3 = (int)ch3;
			d4 = (int)ch4;
			d5 = (int)ch5;
			d6 = (int)ch6;
			d7 = (int)ch7;
			d8 = (int)ch8;
			d9 = (int)ch9;
			d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
			
			if (d10 == 10)
				System.out.println("0" + (d2 * 10000000 + d3 * 1000000 + d4 * 100000 + d5 * 10000 + d6 * 1000 + d7 * 100 + d8 * 10 + d9) + "X");
			else
				System.out.println("0" + (d2 * 100000000 + d3 * 10000000 + d4 * 1000000 + d5 * 100000 + d6 * 10000 + d7 * 1000 + d8 * 100 + d9 * 10 + d10));
		}
	}
}