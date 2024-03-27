import java.util.Scanner;
class LeapYearOrNot{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		if( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 )
		{
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
}