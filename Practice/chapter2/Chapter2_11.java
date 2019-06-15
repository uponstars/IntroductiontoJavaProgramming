import java.util.Scanner;

public class Chapter2_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		long population = 312032486L + (years * 365 * 24 * 3600 / 7) - (years * 365 * 24 * 3600 / 13) + (years * 365 * 24 * 3600 / 45);
		
		System.out.println("The population in " + years + " years is " + population);
	}
}