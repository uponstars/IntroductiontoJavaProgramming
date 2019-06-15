import java.util.Scanner;

public class Chapter5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int line, space, i;
		
		System.out.print("Enter the number of lines: ");
		int num = input.nextInt();
		
		for (line = 1; line <= num; line++) {
			for (space = 1; space <= 15 - line; space++) {
				System.out.print("  ");
			}
			for (i = line; i >= 1; i--) {
				System.out.print(i + " ");
			}
			for (i = 2; i <= line; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}