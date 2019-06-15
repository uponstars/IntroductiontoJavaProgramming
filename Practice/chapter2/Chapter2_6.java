import java.util.Scanner;

public class Chapter2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		
		int a = num % 10;
		num /= 10;
		int b = num % 10;
		num /= 10;
		int c = num;
		int sum = a + b + c;
		
		System.out.println("The sum of digits is " + sum);
	}
}