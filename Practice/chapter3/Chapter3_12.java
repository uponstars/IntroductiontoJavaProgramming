import java.util.Scanner;

public class Chapter3_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int num = input.nextInt();
		
		int digit1 = num % 10;
		int digit2 = num / 100;
		
		if (digit1 == digit2)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}
}