import java.util.Scanner;
class PositiveOrNegative{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num>0){
			System.out.println("It is positive number");
		}
		else{
			System.out.println("It is negative number");
		}
	}
}