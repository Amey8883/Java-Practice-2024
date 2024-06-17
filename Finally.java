class Finally
{
	public static void main(String[] args) {
		try
		{
		System.out.println("Connection Opens");
		System.out.println("Hi");
		System.out.println(10/0);
		}
		finally
		{
			System.out.println("Connection closed");
		}
		
	}
}