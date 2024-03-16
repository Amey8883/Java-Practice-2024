import java.util.Scanner;
class CalculateInterest{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter balance: ");
		double balance = sc.nextDouble();

		System.out.println("Enter annual percentage interest rate: ");
		double annualPercentageInterestRate = sc.nextDouble();

		double interest = balance * (annualPercentageInterestRate/1200);

		System.out.println("The interest is "+interest);

	}
}