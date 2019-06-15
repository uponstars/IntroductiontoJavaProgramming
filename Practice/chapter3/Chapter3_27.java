import java.util.Scanner;

public class Chapter3_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double d = Math.abs((-0.5 * x + y - 100) / Math.pow(5 / 4, 0.5));
		
		if (((200 * y * 0.5) + (100 * x * 0.5) + (Math.pow(50000, 0.5) * d * 0.5)) == 10000.0)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
	}
}