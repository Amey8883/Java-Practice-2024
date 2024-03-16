import java.util.Scanner;
class CostOfDriving{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double drivingDistance = sc.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = sc.nextDouble();

		System.out.print("Enter price per gallon: ");
		double pricePerGallon = sc.nextDouble();

		double cost = (drivingDistance/milesPerGallon)*pricePerGallon;

		System.out.println("$"+cost);
	}
}