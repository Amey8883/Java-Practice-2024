class MethodExample{
	public static void main(String[] args)   //calling method 
	{
		System.out.println("Main Execution starts");
		ramesh();
		System.out.println("Main Execution ends");
	}

	public static void ramesh()      //called method
	{
		System.out.println("ramesh Execution starts");
		suresh();
		System.out.println("ramesh Execution ends");
	}
	public static void suresh()
	{
		System.out.println("suresh Execution starts");
		mahesh();
		System.out.println("suresh Execution ends");
	}
	public static void mahesh()
	{
		System.out.println("mahesh Execution starts");
		System.out.println("mahesh Execution ends");

	}
}