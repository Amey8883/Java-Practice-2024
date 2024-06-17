import java.io.*;
class getMessage
{
	public static void main(String[] args) {
		try
		{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae.getMessage());
		}
	}
}