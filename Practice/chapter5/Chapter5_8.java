import java.util.Scanner;

public class Chapter5_8 {
	public static void main(String[] args) {
		String name = "";
		String theName = "";
		int number = 0;
		double score = 0;
		double maxScore = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of students: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println("What's the student's name? ");
			name = input.next();
			System.out.println("What's the score?");
			score = input.nextDouble();
			
			if (score > maxScore) {
				maxScore = score;
				theName = name;
			}
		}
		
		System.out.println("The maximum score is " + score + ", and the student is " + theName);
	}
}