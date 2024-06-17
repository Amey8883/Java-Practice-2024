import java.util.Scanner;
class NullPointerException
{
	static NullPoi2 p;
	public static void main(String[] args)
	 {
		System.out.println("Main Method Started");
		// NullPoi2 p = new NullPoi2();
		try
		{
			System.out.println(p.a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Main Method Ends");
	}
}