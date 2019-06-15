public class Chapter5_15 {
	public static void main(String[] args) {
		char a;
		
		for (a = 33; a <= 126; a++) {
			System.out.printf("%s ", a);
			if ((a - 32) % 10 == 0)
				System.out.println();
		}
	}
}