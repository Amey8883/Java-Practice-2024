class EvenNumberRecursion{
	static int num = 2;
	static int num2 = 100;
	public static void main(String[] args) {
		numbers();
	}

	public static void numbers()
	{
		if(num <= num2){
		if(num%2==0)
		{
			System.out.println("Even number "+num);
		}
			num++;
			numbers();
	}
	
}
}