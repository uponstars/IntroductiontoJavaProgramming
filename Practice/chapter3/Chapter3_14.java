import java.util.Scanner;

public class Chapter3_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = (int)(Math.random() + 0.5);
		
		System.out.print("Enter 0 for back and 1 for front of the coin: ");
		int guess = input.nextInt();
		
		if (guess == a)
			System.out.println("Lucky! You are right!");
		else
			System.out.println("Bad luck, you are wrong!");
	}
}