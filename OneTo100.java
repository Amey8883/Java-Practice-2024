class OneTo100{
	static int num = 1;
	public static void main(String[] args) {
		numbers();
	}

	public static void numbers()
	{
		if(num<=10)
		{
			System.out.println(num);
			num++;
			numbers();
		}
	}
	
}
