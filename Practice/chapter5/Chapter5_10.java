public class Chapter5_10 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0 || i % 6 == 0) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}
}