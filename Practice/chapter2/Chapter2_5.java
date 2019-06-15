import java.util.Scanner;

public class Chapter2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double cost = input.nextDouble();
		double rate = input.nextDouble();
		rate /= 100.0;
		
		double gratuity = cost * rate;
		double total = cost + gratuity;
		
		System.out.println("The gratuity is " + gratuity + " and total is $" + total);
	}
}