import java.util.Scanner;

public class Chapter2_4 {
	public static void main(String[] args) {
		final double POUND_TO_KILOGRAM = 0.454;
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilogram = pounds * POUND_TO_KILOGRAM;
		
		System.out.println(pounds + " pounds is " + kilogram + " kilograms");
	}
}