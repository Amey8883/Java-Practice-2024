import java.io.*;
class printStackTrace
{
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
}