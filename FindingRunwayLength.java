import java.util.Scanner;
class FindingRunwayLength{
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter speed  ");
	double speed = sc.nextDouble();
	System.out.println("Enter acceleartion");
	double acceleartion = sc.nextDouble();
	double length = (speed * speed) / (acceleartion * 2);
	System.out.println("The minimum runway length for this airplane is "+length);
		
	}
	
}
