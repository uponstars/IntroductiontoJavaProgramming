import java.util.Scanner;

public class Chapter3_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package (in pounds): ");
		double weight = input.nextDouble();
		double cost = 0;
		
		if (weight <= 1)
			cost = 3.5 * weight;
		else if (weight <= 3)
			cost = 3.5 + (weight - 1) * 5.5;
		else if (weight <= 10)
			cost = 3.5 + 11 + (weight - 3) * 8.5;
		else if (weight <= 20)
			cost = 3.5 + 11 + 59.5 + (weight - 10) * 10.5;
		else {
			System.out.println("The package cannot be shipped");
			System.exit(0);
		}
		
		System.out.println("The cost of package shipped is $" + cost);
	}
}