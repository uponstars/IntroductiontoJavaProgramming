import java.util.Scanner;

public class Chapter4_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		double x2 = 0;
		double y2 = radius;
		double x3 = -radius * Math.cos(Math.PI / 2 - 2 * Math.PI / 5);
		double y3 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x3, 2));
		double x1 = -x3;
		double y1 = y3;
		double y4 = -radius * Math.sin(4 * Math.PI / 5 - Math.PI / 2);
		double x4 = -Math.sqrt(Math.pow(radius, 2) - Math.pow(y4, 2));
		double x5 = -x4;
		double y5 = y4;
		
		System.out.println("The coordinates of five points on the pentagon are\n"
							+ "(" + x1 + ", " + y1 + ")\n"
							+ "(" + x2 + ", " + y2 + ")\n"
							+ "(" + x3 + ", " + y3 + ")\n"
							+ "(" + x4 + ", " + y4 + ")\n"
							+ "(" + x5 + ", " + y5 + ")");
	}
}