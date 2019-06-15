public class Chapter5_3 {
	public static void main(String[] args) {
		int kilogram;
		double pound;
		final double KILOGRAM_TO_POUND = 2.2;
		
		System.out.println("kilogram                   pound");
		for (kilogram = 1; kilogram < 200; kilogram++) {
			pound = kilogram * KILOGRAM_TO_POUND;
			System.out.printf("%4d                     %4.1f\n", kilogram, pound);
		}
	}
}