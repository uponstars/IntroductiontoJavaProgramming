import java.util.Scanner;

public class Chapter4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String str = input.nextLine();
		char code = str.charAt(0);
		
		System.out.printf("The Unicode for the character %c is %d", code, (int)(code));
	}
}