import java.util.Scanner;
class InterviewOrNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Percentage: ");
		float percentage = sc.nextFloat();
		if(percentage>60.00){
			System.out.println("You are eligible for interview");
		}
		else{
			System.out.println("You are not eligible for interview");
		}
	}
}