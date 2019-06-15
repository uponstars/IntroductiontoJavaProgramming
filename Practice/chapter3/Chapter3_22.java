import java.util.Scanner;

public class Chapter3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point(x, y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		
		if (distance <= 10)
			System.out.println("(" + x + ", " + y + ")" + " The point is in the circle.");
		else
			System.out.println("(" + x + ", " + y + ")" + " The point is out of the circle.");
	}
}