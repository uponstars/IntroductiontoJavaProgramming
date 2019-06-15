import java.util.Scanner;

public class Chapter2_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double t0 = input.nextDouble();
		
		System.out.print("Ente the final temperature: ");
		double t1 = input.nextDouble();
		
		double energy = weight * (t1 - t0) * 4184;
		
		System.out.println("The energy needed is " + (int)(energy * 10) / 10.0);
	}
}