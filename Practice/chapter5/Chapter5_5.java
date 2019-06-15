public class Chapter5_5 {
	public static void main(String[] args) {
		int kilogram;
		double pounds;
		int pound;
		double kilograms;
		final double KILOGRAM_TO_POUND = 2.2;
		
		System.out.println("kilogram		pound		pound		kilogram");
		
		for (kilogram = 1, pound = 20; kilogram < 200; kilogram += 2,pound += 5) {
			pounds = kilogram * KILOGRAM_TO_POUND;
			kilograms = pound / KILOGRAM_TO_POUND;
			
			System.out.printf("%8d		%5.1f		%5d		%8.2f\n", kilogram, pounds, pound, kilograms);
		}
	}
}