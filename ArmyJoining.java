import java.util.Scanner;
class ArmyJoining{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the age ");
		int age = sc.nextInt();
		
		if(age>=18){
			System.out.print("Enter the height");
			double height = sc.nextDouble();
			System.out.print("Enter the weight");
			double weight = sc.nextDouble();
			if(height>=162 && weight>=56){
				System.out.println("You are eligible for Army joining");
			}else{
				System.out.println("You are not eligible for Army joining");
			}

		}else{
			System.out.println("User is not eligible for army try after "+(18-)+"years");
		}
		
	}
}