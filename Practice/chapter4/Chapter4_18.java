import java.util.Scanner;

public class Chapter4_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String str = input.nextLine();
		char major = str.charAt(0);
		int grade = Integer.parseInt("" + str.charAt(1));
		
		if ((grade >= 1 && grade <= 4) && (major == 'M' || major == 'C' || major == 'I')) {
			if (major == 'M') {
				switch (grade) {
					case 1: System.out.println("Mathematics Freshman");break;
					case 2: System.out.println("Mathematics Sophomore");break;
					case 3: System.out.println("Mathematics Junior");break;
					case 4: System.out.println("Mathematics Senior");break;
				}
			}
			else if (major == 'C') {
				switch (grade) {
					case 1: System.out.println("Computer Science Freshman");break;
					case 2: System.out.println("Computer Science Sophomore");break;
					case 3: System.out.println("Computer Science Junior");break;
					case 4: System.out.println("Computer Science Senior");break;
				}
			}
			else if (major == 'I') {
				switch (grade) {
					case 1: System.out.println("Information Technology Freshman");break;
					case 2: System.out.println("Information Technology Sophomore");break;
					case 3: System.out.println("Information Technology Junior");break;
					case 4: System.out.println("Information Technology Senior");break;
				}
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}