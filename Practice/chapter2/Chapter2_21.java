import java.util.Scanner;

public class Chapter2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double futureAmount = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		
		System.out.println("Accumulated value is $" + (int)(futureAmount * 100) / 100.0);
	}
}