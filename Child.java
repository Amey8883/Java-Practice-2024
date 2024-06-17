class Child
{
	static Parent p;
	public static void main(String[] args) {
		System.out.println("Parent started");
		Scanner men = new Scanner(System.in);
		System.out.println("What is your name");
		try
		{
			p.human = men.nextLine();
		}
		catch(Throwable t)
		{
			System.out.println("Handle");
		}
		System.out.println("End");
	}
}