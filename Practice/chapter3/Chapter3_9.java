import java.util.Scanner;

public class Chapter3_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		
		int d9 = isbn % 10;
		int remainingNum = isbn / 10;
		int d8 = remainingNum % 10;
		remainingNum /= 10;
		int d7 = remainingNum % 10;
		remainingNum /= 10;
		int d6 = remainingNum % 10;
		remainingNum /= 10;
		int d5 = remainingNum % 10;
		remainingNum /= 10;
		int d4 = remainingNum % 10;
		remainingNum /= 10;
		int d3 = remainingNum % 10;
		remainingNum /= 10;
		int d2 = remainingNum % 10;
		
		int d10 = (0 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 == 10)
			System.out.println("0" + (d2 * 10000000 + d3 * 1000000 + d4 * 100000 + d5 * 10000 + d6 * 1000 + d7 * 100 + d8 * 10 + d9) + "X");
		else
			System.out.println("0" + (d2 * 100000000 + d3 * 10000000 + d4 * 1000000 + d5 * 100000 + d6 * 10000 + d7 * 1000 + d8 * 100 + d9 * 10 + d10));
	}
}