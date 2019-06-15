public class Chapter5_19 {
	public static void main(String[] args) {
		int line, i, space;
		
		for (line = 1; line <= 8; line++) {
			for (space = 1; space <= 9 - line; space++) {
				System.out.print("    ");
			}
			for (i = 1; i <= line - 1; i++) {
				System.out.printf("%4.0f", Math.pow(2, i - 1));
			}
			for (; i >= 1; i--) {
				System.out.printf("%4.0f", Math.pow(2, i - 1));
			}
			System.out.println();
		}
	}
}