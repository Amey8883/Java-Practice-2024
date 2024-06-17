class ExceptionExample1{
	public static void main(String[] args) {
		System.out.println("HII");
		try{
			System.out.println("outer try");
			System.out.println(10/0);
		}
		catch(ArithmeticException i)
		{
			System.out.println("OUTER CATCH 1");
			try{
				System.out.println("INNER TRY");
				System.out.println(10/0);
			}
			catch(NullPointerException ie)
			{
				System.out.println("INNER CATCH");
			}
		}
		catch(Exception i)
		{
			System.out.println("Outer catch 2");
		}
	}
}