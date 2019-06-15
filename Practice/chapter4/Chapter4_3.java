import java.util.Scanner;

public class Chapter4_3 {
	public static void main(String[] args) {
		final double r = 6371.01;               //The average radian of earth
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Atlanta's latitude and longitude in degrees: ");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		System.out.print("Enter Orlando's latitude and longitude in degrees: ");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();
		System.out.print("Enter Savannah's latitude and longitude in degrees: ");
		double latitude3 = input.nextDouble();
		double longitude3 = input.nextDouble();
		System.out.print("Enter Charlotte's latitude and longitude in degrees: ");
		double latitude4 = input.nextDouble();
		double longitude4 = input.nextDouble();
		
		double x1 = Math.toRadians(latitude1);
		double y1 = Math.toRadians(longitude1);
		double x2 = Math.toRadians(latitude2);
		double y2 = Math.toRadians(longitude2);
		double x3 = Math.toRadians(latitude3);
		double y3 = Math.toRadians(longitude3);
		double x4 = Math.toRadians(latitude4);
		double y4 = Math.toRadians(longitude4);
		
		double distanceOneToTwo = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		double distanceTwoToThree = r * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
		double distaceOneToThree = r * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
		double distanceTwoToFour = r * Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));
		double distanceThreeToFour = r * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
		double s1 = (distanceOneToTwo + distanceTwoToThree + distaceOneToThree) / 2;
		double s2 = (distanceTwoToThree + distanceThreeToFour + distanceTwoToFour) / 2;
		double area1 = Math.pow(s1 * (s1 - distanceOneToTwo) * (s1 - distanceTwoToThree) * (s1 - distanceThreeToFour), 0.5);
		double area2 = Math.pow(s2 * (s2 - distanceTwoToThree) * (s2 - distanceThreeToFour) * (s2 - distanceTwoToFour), 0.5);
		
		System.out.println("The area of four cities is " + (area1 + area2) + " sq.km");
	}
}