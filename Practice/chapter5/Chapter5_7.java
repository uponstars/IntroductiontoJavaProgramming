public class Chapter5_7 {
	public static void main(String[] args) {
		int i;
		int year = 10;
		double rate = 0.05;
		double cost = 10000;
		double sum = 0;
		
		for (i = 1; i <= year; i++) {
			cost = cost * 0.05 + cost;
			System.out.println("The cost of " + i + " year is " + cost);
		}
		
		for (i = 1; i <= 4; i++) {
			cost = cost * 0.05 + cost;
			sum += cost;
		}
		
		System.out.println("The sum of 4 years from tenth year is " + sum);
	}
}