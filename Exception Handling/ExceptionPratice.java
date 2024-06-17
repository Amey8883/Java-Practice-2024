class ExceptionPratice
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Hi from try");
			System.out.println(10/0);
			try
			{
				System.out.println("inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException a)
			{
				System.out.println("inner a handle");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi from catch");
		}
	}
}

/* Output: Hi from try
           Hi from catch*/