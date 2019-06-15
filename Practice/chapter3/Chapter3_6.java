import java.util.Scanner;

public class Chapter3_6 {
	public static void main(String[] args) {
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter feet: ");
		double heightInFeet = input.nextDouble();
		System.out.print("Enter inches: ");
		double heightInInches = input.nextDouble();
		
		double height = METERS_PER_INCH * (heightInFeet * 10 + heightInInches);
		weight = weight * KILOGRAMS_PER_POUND;
		double bmi = weight / (height * height);
		
		//display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}