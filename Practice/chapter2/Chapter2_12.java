import java.util.Scanner;

public class Chapter2_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double velocity = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double runwayLength = (velocity * velocity) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + (int)(runwayLength * 1000) / 1000.0);
	}
}