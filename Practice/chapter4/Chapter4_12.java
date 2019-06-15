import java.util.Scanner;

public class Chapter4_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex digit: ");
		String hexDigit = input.next();
		char digit = hexDigit.charAt(0);
		int number = 0;
		
		if (digit >= '0' && digit <= '9') {
			number = (int)digit;
			System.out.println("The binary value is " + Integer.toBinaryString(number));
		}
		else if (digit >= 'A' && digit <= 'F') {
			number = digit - 'A' + 10;
			System.out.println("The binary value is " + Integer.toBinaryString(number));
		}
		else if (digit >= 'a' && digit <= 'f') {
			number = digit - 'a' + 10;
			System.out.println("The binary value is " + Integer.toBinaryString(number));
		}
		else
			System.out.println(digit + " is an invalid input");
	}
}