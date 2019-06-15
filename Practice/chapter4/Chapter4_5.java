import java.util.Scanner;

public class Chapter4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of side: ");
		int numberOfSide = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (numberOfSide * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSide));
		
		System.out.println("The area of the polygon is " + area);
	}
}