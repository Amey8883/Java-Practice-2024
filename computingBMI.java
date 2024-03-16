import java.util.Scanner;
class ComputingBMI{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a weight in pounds: ");
		double weightInPounds = sc.nextDouble();

		System.out.print("Enter height in inches: ");
		double heightInches = sc.nextDouble();

		double weightInKilograms = weightInPounds * 0.453592;
		double heightInMeters = heightInches * 0.0254;

		double bmi = weightInKilograms/(heightInMeters*heightInMeters);

		System.out.println(bmi);
	}
}

