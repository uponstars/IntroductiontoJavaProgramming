import java.util.Scanner;

public class Chapter5_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i;
		int a;
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		label:
		for (i = 2; i != num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
				num /= i;
				continue label;
			}
		}
		
		System.out.print(num);
	}
}