import java.util.Scanner;

public class Chapter4_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.next();
		int length = str.length();
		char firstChar = str.charAt(0);
		
		System.out.println("The string's length is " + length + " and first character is " + firstChar);
	}
}