import java.util.Scanner;

public class Chapter3_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert = input.nextInt();
		
		if (convert == 0) {
			System.out.print("Enter the dollar amount: ");
			double amount = input.nextDouble();
			double amountInRMB = amount * exchangeRate;
			System.out.println("$" + amount + " is " + amountInRMB + " yuan");
		}
		else if (convert == 1) {
			System.out.print("Enter the RMB amount: ");
			double amount = input.nextDouble();
			double amountInDollar = amount / exchangeRate;
			System.out.println(amount + " yuan is $" + amountInDollar);
		}
		else
			System.out.println("Wrong convert number!");
			System.exit(0);
	}
}