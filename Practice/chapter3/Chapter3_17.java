import java.util.Scanner;

public class Chapter3_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Scissor(0), rock(1), paper(2): ");
		int guess = input.nextInt();
		
		int num = (int)(Math.random() * 3);
		
		if (num == 0) {
			switch (guess) {
				case 0: System.out.println("The computer is scissor. You are scissor. It is a draw");break;
				case 1: System.out.println("The computer is scissor. You are rock. You won");break;
				case 2: System.out.println("The computer is scissor. You are paper. You lost");break;
				default: System.out.println("You enter a wrong number.");
			}
		}
		else if (num == 1) {
			switch (guess) {
				case 0: System.out.println("The computer is rock. You are scissor. You lost");break;
				case 1: System.out.println("The computer is rock. You are rock. It is a draw");break;
				case 2: System.out.println("The computer is rock. You are paper. You won");break;
				default: System.out.println("You entered a wrong number.");
			}
		}
		else {
			switch (guess) {
				case 0: System.out.println("The computer is paper. You are scissor. You won");break;
				case 1: System.out.println("The computer is paper. You are rock. You lost");break;
				case 2: System.out.println("The computer is paper. You are paper. It is a draw");break;
				default: System.out.println("You entered a wrong number.");
			}
		}
	}
}