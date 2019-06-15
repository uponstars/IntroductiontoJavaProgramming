import java.util.Scanner;

public class Chapter5_14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int d = n1;
		if (n1 > n2)
			d = n2;
		
		for (; d >= 1; d--) {
			if (n1 % d == 0 && n2 % d == 0) {
				System.out.println("n1 and n2's greatest common divisor is " + d);
				break;
			}
		}
	}
}