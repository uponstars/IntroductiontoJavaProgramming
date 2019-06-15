public class Chapter4_25 {
	public static void main(String[] args) {
		char ch1 = (char)('A' + Math.random() * 26);
		char ch2 = (char)('A' + Math.random() * 26);
		char ch3 = (char)('A' + Math.random() * 26);
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		int num4 = (int)(Math.random() * 10);
		
		System.out.println("The number of car is " + ch1 + ch2 + ch3 + num1 + num2 + num3 + num4);
	}
}