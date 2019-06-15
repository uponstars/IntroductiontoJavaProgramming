public class TestSum {
	public static void main(String[] args) {
		//Initialize sum
		float sum = 0;
		
		//Add 0.01....to sum
		for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
			sum += i;
		
		//Display result
		System.out.println("The sum is " + sum);
	}
}