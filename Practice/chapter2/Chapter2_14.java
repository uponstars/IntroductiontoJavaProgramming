import java.util.Scanner;

public class Chapter2_14 {
	public static void main(String[] args) {
		final double POUND_TO_KILOGRAM = 0.45359237;
		final double INCH_TO_METER = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double bmi = (weight * POUND_TO_KILOGRAM) / Math.pow((height * INCH_TO_METER), 2);
		
		System.out.println("BMI is " + (int)(bmi * 10000) / 10000.0);
	}
}