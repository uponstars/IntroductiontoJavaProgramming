import java.util.Scanner;

public class Chapter2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		
		double accountValue = ((((((amount * (1 + 0.00417) + amount)* (1 + 0.00417)) + amount) * (1 + 0.00417) + amount) * (1 + 0.00417) + amount) * (1 + 0.00417) + amount) * (1 + 0.00417);
		
		System.out.println("After the sixth month, the account valu is $" + (int)(accountValue * 100) / 100.0);
	}
}