public class Chapter5_6 {
	public static void main(String[] args) {
		int mile;
		double kilometers;
		int kilometer;
		double miles;
		final double MILE_TO_KILOMETER = 1.609;
		
		System.out.println("mile		kilometer		kilometer		mile");
		
		for (mile = 1, kilometer = 20; mile < 11; mile++, kilometer += 5) {
			kilometers = mile * MILE_TO_KILOMETER;
			miles = kilometer / MILE_TO_KILOMETER;
			
			System.out.printf("%4d		%9.3f		%9d		%4.3f\n", mile, kilometers, kilometer, miles);
		}
	}
}