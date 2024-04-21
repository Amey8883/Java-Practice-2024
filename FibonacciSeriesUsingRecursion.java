class FibonacciSeriesUsingRecursion{
	static int num1 = 0;
	static int num2 = 1;
	public static void main(String[] args) {
		fibonacci();
		System.out.println(num1+" "+num2);
	}

	public static void fibonacci()
	{
		for(int i=1;i<=10;i++)
		{
			int op = num1+num2;
			System.out.print(op+" ");
			num1=num2;
			num2=op;
		}
	}
}

























