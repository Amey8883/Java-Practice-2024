import java.util.Scanner;
class NullPointerandArithmeticException 
{
	static DemoA d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the Number: ");
			DemoA d = new DemoA();
			d.num = sc.nextInt();

			try
			{
				System.out.println(d.num/10);
			} 
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
	}
}