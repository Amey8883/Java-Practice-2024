class toString
{
	public static void main(String[] args) {
		Thread.currentThread().setName("Ramesh");
		try
		{
			String a = null;
			System.out.println(a.isEmpty());
		}
		catch(NullPointerException ae)
		{
			System.out.println(ae);
			System.out.println(ae.toString());
		}
	}
}