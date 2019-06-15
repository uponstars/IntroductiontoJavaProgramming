import java.util.Scanner;

public class Chapter2_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double time = input.nextDouble();
		
		double acceleration = (v1 - v0) / time;
		
		System.out.println("The average acceleration is " + (int)(acceleration * 10000) / 10000.0);
	}
}