public class Chapter5_11 {
	public static void main(String[] args) {
		int i;
		int count = 0;
		
		for (i = 100; i <= 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}
}