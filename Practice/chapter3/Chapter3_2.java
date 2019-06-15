import java.util.Scanner;

public class Chapter3_2 {
	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 5 % 10);
		int number3 = (int)(System.currentTimeMillis() / 7 % 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
	}
}