import java.util.Scanner;
class CalculateEnergy{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the amount of water in kilograms: ");
		double m =  sc.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = sc.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemperature = sc.nextDouble();

		double Q = m * (finalTemperature-initialTemperature)*4184;
		System.out.println("The energy needed is "+Q);

	}
}

