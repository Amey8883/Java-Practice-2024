class UncheckedException
{
	public static void main(String[] args) {
		String a = Null;
		if(a.isEmpty()) //This will throw a NullPointerException
		{
			System.out.print("Hi");
		}
	}
}