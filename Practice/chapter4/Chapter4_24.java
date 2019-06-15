import java.util.Scanner;

public class Chapter4_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String firstCity = input.nextLine();
		System.out.print("Enter the second city: ");
		String secondCity = input.nextLine();
		System.out.print("Enter the third city: ");
		String thirdCity = input.nextLine();
		
		if (firstCity.compareToIgnoreCase(secondCity) > 0) {
			if (firstCity.compareToIgnoreCase(thirdCity) > 0) {
				if (secondCity.compareToIgnoreCase(thirdCity) > 0) {
					System.out.println(thirdCity + " " + secondCity + " " + firstCity);
				}
				else {
					System.out.println(secondCity + " " + thirdCity + " " + firstCity);
				}
			}
			else {
				System.out.println(secondCity + " " + firstCity + " " + thirdCity);
			}
		}
		else {
			if (secondCity.compareToIgnoreCase(thirdCity) > 0) {
				if (firstCity.compareToIgnoreCase(thirdCity) > 0) {
					System.out.println(thirdCity + " " + firstCity + " " + secondCity);
				}
				else {
					System.out.println(firstCity + " " + thirdCity + " " + secondCity);
				}
			}
			else {
				System.out.println(firstCity + " " + secondCity + " " + thirdCity);
			}
		}
	}
}