import java.util.Scanner;

public class Chapter4_2 {
	public static void main(String[] args) {
		final double r = 6371.01;               //The average radian of earth
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();
		
		double x1 = Math.toRadians(latitude1);
		double y1 = Math.toRadians(longitude1);
		double x2 = Math.toRadians(latitude2);
		double y2 = Math.toRadians(longitude2);
		double distance = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two points is " + distance + " km");
	}
}