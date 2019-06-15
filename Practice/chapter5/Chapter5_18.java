public class Chapter5_18 {
	public static void main(String[] args) {
		int line, i;
		
		for (line = 1; line <= 6; line++) {
			for (i = 1; i <= line; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (line = 6; line >= 1; line--) {
			for (i = 1; i <= line; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (line = 1; line <= 6; line++) {
			for (i = 1; i <= 6 - line; i++) {
				System.out.print("  ");
			}
			for (; i <= 6; i++) {
				System.out.print(7 - i + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (line = 1; line <= 6; line++) {
			for (i = 1; i < line; i++) {
				System.out.print("  ");
			}
			for (i = 1; i <= 7 - line; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}