import java.util.Scanner;

public class Chapter3_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double temperature = 0;
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double fahrenheit = input.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		if (windSpeed >= 2 && fahrenheit >= -58 && fahrenheit <= 41)
			temperature = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
		else {
			System.out.println("The temperature or wind speed you entered is wrong!");
			System.exit(0);
		}
		
		System.out.println("The wind chill index is " + (int)(temperature * 100000) / 100000.0);
	}
}