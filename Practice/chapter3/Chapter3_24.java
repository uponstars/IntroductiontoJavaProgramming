import java.util.Scanner;

public class Chapter3_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1-52 to pick your card: ");
		int card = input.nextInt();
		
		if (card <= 4) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is Ace of Spades");break;
				case 1: System.out.println("The card you picked is Ace of Clubs");break;
				case 2: System.out.println("The card you picked is Ace of Diamonds");break;
				case 3: System.out.println("The card you picked is Ace of Hearts");break;
			}
		}
		else if (card <= 8) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 2 of Spades");break;
				case 1: System.out.println("The card you picked is 2 of Clubs");break;
				case 2: System.out.println("The card you picked is 2 of Diamonds");break;
				case 3: System.out.println("The card you picked is 2 of Hearts");break;
			}
		}
		else if (card <= 12) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 3 of Spades");break;
				case 1: System.out.println("The card you picked is 3 of Clubs");break;
				case 2: System.out.println("The card you picked is 3 of Diamonds");break;
				case 3: System.out.println("The card you picked is 3 of Hearts");break;
			}
		}
		else if (card <= 16) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 4 of Spades");break;
				case 1: System.out.println("The card you picked is 4 of Clubs");break;
				case 2: System.out.println("The card you picked is 4 of Diamonds");break;
				case 3: System.out.println("The card you picked is 4 of Hearts");break;
			}
		}
		else if (card <= 20) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 5 of Spades");break;
				case 1: System.out.println("The card you picked is 5 of Clubs");break;
				case 2: System.out.println("The card you picked is 5 of Diamonds");break;
				case 3: System.out.println("The card you picked is 5 of Hearts");break;
			}
		}
		else if (card <= 24) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 6 of Spades");break;
				case 1: System.out.println("The card you picked is 6 of Clubs");break;
				case 2: System.out.println("The card you picked is 6 of Diamonds");break;
				case 3: System.out.println("The card you picked is 6 of Hearts");break;
			}
		}
		else if (card <= 28) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 7 of Spades");break;
				case 1: System.out.println("The card you picked is 7 of Clubs");break;
				case 2: System.out.println("The card you picked is 7 of Diamonds");break;
				case 3: System.out.println("The card you picked is 7 of Hearts");break;
			}
		}
		else if (card <= 32) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 8 of Spades");break;
				case 1: System.out.println("The card you picked is 8 of Clubs");break;
				case 2: System.out.println("The card you picked is 8 of Diamonds");break;
				case 3: System.out.println("The card you picked is 8 of Hearts");break;
			}
		}
		else if (card <= 36) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 9 of Spades");break;
				case 1: System.out.println("The card you picked is 9 of Clubs");break;
				case 2: System.out.println("The card you picked is 9 of Diamonds");break;
				case 3: System.out.println("The card you picked is 9 of Hearts");break;
			}
		}
		else if (card <= 40) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is 10 of Spades");break;
				case 1: System.out.println("The card you picked is 10 of Clubs");break;
				case 2: System.out.println("The card you picked is 10 of Diamonds");break;
				case 3: System.out.println("The card you picked is 10 of Hearts");break;
			}
		}
		else if (card <= 44) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is Jack of Spades");break;
				case 1: System.out.println("The card you picked is Jack of Clubs");break;
				case 2: System.out.println("The card you picked is Jack of Diamonds");break;
				case 3: System.out.println("The card you picked is Jack of Hearts");break;
			}
		}
		else if (card <= 48) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is Queen of Spades");break;
				case 1: System.out.println("The card you picked is Queen of Clubs");break;
				case 2: System.out.println("The card you picked is Queen of Diamonds");break;
				case 3: System.out.println("The card you picked is Queen of Hearts");break;
			}
		}
		else if (card <= 52) {
			switch (card % 4) {
				case 0: System.out.println("The card you picked is King of Spades");break;
				case 1: System.out.println("The card you picked is King of Clubs");break;
				case 2: System.out.println("The card you picked is King of Diamonds");break;
				case 3: System.out.println("The card you picked is King of Hearts");break;
			}
		}
		else {
			System.out.println("The number you entered is wrong!");
			System.exit(0);
			}
	}
}