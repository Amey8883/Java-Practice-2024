class Exception1
{
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
			System.out.println(10/0);
		}

		catch(RuntimeException re)
		{
			System.out.println("Runtime Exception");
		}
		System.out.println("Bye");
	}
}