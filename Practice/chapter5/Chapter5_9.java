import java.util.Scanner;

public class Chapter5_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = "";
		String name1 = "";
		String name2 = "";
		int number = 0;
		double score = 0;
		double score1 = 0;
		double score2 = 0;
		
		System.out.print("Please enter the number of students: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println("What is the student's name?");
			name = input.nextLine();
			System.out.println("What's the score?");
			score = input.nextDouble();
			
			if (score > score1) {
				score1 = score;
				name1 = name;
				
				if (score1 >= score2) {
					name2 = name1;
					score2 = score1;
				}
			}
		}
		
		System.out.println("The first is " + name2 + " ," + score2 + ",and second is " + name1 + " ," + score1);
	}
}