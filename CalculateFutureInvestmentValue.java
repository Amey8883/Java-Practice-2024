// import java.util.Scanner;
// class CalculateFutureInvestmentValue{
// 	public static void main(String[] args) {
		
// 		Scanner sc = new Scanner(System.in);

// 		System.out.print("Enter investment amount: ");
// 		double investmentAmount = sc.nextDouble();

// 		System.out.print("Enter annual interest rate: ");
// 		double annualInterestRate = sc.nextDouble();

// 		System.out.print("Enter number of years: ");
// 		double numberOfYears = sc.nextDouble();

// 	    double futureInvestmentValue = investmentAmount * ((1 + annualInterestRate / 100),numberOfYears);

// 		System.out.println("Accumulated value is "+futureInvestmentValue);
		
// 	}
// }

import java.util.Scanner;

class CalculateFutureInvestmentValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = sc.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate / 100), numberOfYears);

        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
