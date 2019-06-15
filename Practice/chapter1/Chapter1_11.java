public class Chapter1_11 {
	public static void main(String[] args) {
		System.out.println("First year: " + (312032486L + (365 * 24 * 3600 / 7) - (365 * 24 * 3600 / 13) + (365 * 24 * 3600 / 45)));
		System.out.println("Second year: " + (312032486L + (2 * 365 * 24 * 3600 / 7) - (2 * 365 * 24 * 3600 / 13) + (2 * 365 * 24 * 3600 / 45)));
		System.out.println("Third year: " + (312032486L + (3 * 365 * 24 * 3600 / 7) - (3 * 365 * 24 * 3600 / 13) + (3 * 365 * 24 * 3600 / 45)));
		System.out.println("Fourth year: " + (312032486L + (4 * 365 * 24 * 3600 / 7) - (4 * 365 * 24 * 3600 / 13) + (4 * 365 * 24 * 3600 / 45)));
		System.out.println("Fifth year: " + (312032486L + (5 * 365 * 24 * 3600 / 7) - (5 * 365 * 24 * 3600 / 13) + (5 * 365 * 24 * 3600 / 45)));
	}
}