import java.util.Scanner;

public class Chapter2_3 {
	public static void main(String[] args) {
		final double INCH_TO_METER = 0.305;
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double meter = feet * INCH_TO_METER;
		
		System.out.println(feet + " feet is " + meter + " meters");
	}
}