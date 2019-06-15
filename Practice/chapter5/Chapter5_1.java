import java.util.Scanner;

public class Chapter5_1 {
	public static void main(String[] args) {
		int positive = 0;
		int negative = 0;
		double total = 0;
		double average = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int integer = input.nextInt();
		if (integer == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}
		total += integer;
		
		while (integer != 0) {
			integer = input.nextInt();
			
			total += integer;
			if (integer < 0)
				negative++;
			else
				positive++;
		}
		
		average = total / (negative + positive);
		System.out.println("The number of positive is " + positive
							+ "\nThe number of negative is " + negative
							+ "\nThe total is " + total
							+ "\nThe average is " + average);
	}
}