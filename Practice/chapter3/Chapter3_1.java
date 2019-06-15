import java.util.Scanner;

public class Chapter3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		//Judge how many roots
		if (delta > 0) {
			double r1 = (Math.pow(delta, 0.5) - b) / (2 * a);
			double r2 = (-Math.pow(delta, 0.5) - b) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if (delta == 0) {
			double r = -b / (2 * a);
			System.out.println("The equation has one root " + r);
		}
		else
			System.out.println("The equation has no real roots");
	}
}