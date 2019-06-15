import java.util.Scanner;

public class Chapter4_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		if (value >= 0 && value <= 15)
			System.out.printf("The hex value is %x", value);
		else
			System.out.println(value + " is an invalid input");
	}
}