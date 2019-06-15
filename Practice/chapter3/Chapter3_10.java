import java.util.Scanner;

public class Chapter3_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		
		System.out.print("What is " + num1 + " + " + num2 + "? ");
		int answer = input.nextInt();
		
		System.out.println("Your answer is " + (num1 + num2 == answer));
	}
}