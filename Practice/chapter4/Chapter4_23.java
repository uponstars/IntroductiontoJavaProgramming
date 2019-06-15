import java.util.Scanner;

public class Chapter4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double workHour = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = workHour * payRate;
		double federalTax = grossPay * federalTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double totalDeduction = federalTax + stateTax;
		double netPay = grossPay - totalDeduction;
		
		System.out.printf("Employee Name: %s\nHours Worked: %4.2f\nPay Rate: $%4.2f\nGross Pay: $%4.2f\n"
							+ "Deductions:\n  Federal Withholding (20.0%%): $%4.2f\n"
							+ "  State Withholding (9.0%): $%4.2f\n"
							+ "  Total Deduction: $%4.2f\n"
							+ "Net Pay: $%4.2f", name, workHour, payRate, grossPay, federalTax, stateTax, totalDeduction, netPay);
	}
}