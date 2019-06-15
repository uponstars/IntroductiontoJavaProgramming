import java.util.Scanner;

public class Chapter3_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				int temp = num1;
				num1 = num3;
				num3 = temp;
			}
			else
				;
		}
		else
			;
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}