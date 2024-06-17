class Demo9
{
	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hello");
		try
		{
			System.out.println("Hi 1");
			System.out.println(10/0);
			System.out.println("Hi 2");
		}
		catch(Arithmetic)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Bye");
		System.out.println("No");
	}
}