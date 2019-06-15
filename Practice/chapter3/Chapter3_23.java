import java.util.Scanner;

public class Chapter3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5)
			System.out.println("point " + "(" + x + ", " + y + ")" + " is in the retangle");
		else
			System.out.println("point " + "(" + x + ", " + y + ")" + " is not in the retangle");
	}
}