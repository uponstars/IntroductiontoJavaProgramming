public class Chapter5_4 {
	public static void main(String[] args) {
		int mile;
		double kilometer;
		final double MILE_TO_KILOMETER = 1.609;
		
		System.out.println("mile                   kilometer");
		for (mile = 1; mile < 11; mile++) {
			kilometer = mile * MILE_TO_KILOMETER;
			System.out.printf("%4d                     %5.3f\n", mile, kilometer);
		}
	}
}