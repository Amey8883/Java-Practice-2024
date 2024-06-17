import java.util.Scanner;
class AgeException extends Exception
{ String desc;
	AgeException(String desc)
	{
		super(desc);
	}
}


class Driver1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age<18)
		{
			try
			{
            	throw new AgeException("Age is under 18");
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
		}else{
			System.out.println("You are eligible");
		}
	}
}