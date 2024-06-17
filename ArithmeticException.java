import java.util.Scanner;
class ArithmeticException
{
	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		try
		{
			System.out.println(num/10);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		System.out.print("Main method ends");
	}
}