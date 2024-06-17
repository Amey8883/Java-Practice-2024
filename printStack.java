import java.io.*;
class printStack
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