import java.util.Scanner;

public class Chapter3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double length = 0;
		System.out.print("Enter the length of triangle's sides: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c) > a)
			length = a + b + c;
		else {
			System.out.println("The values entered is invalid.");
			System.exit(0);
		}
		
		System.out.println("The sum of triangle's three sides is " + length);
	}
}