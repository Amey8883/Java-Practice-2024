class FactorialUsingRecursion{
	static int num = 5;
	static int fact = 1;
	public static void main(String[] args) {
		factorial(num);
		System.out.print(fact);
	}

	public static void factorial(int i)
	{
		if(i >= 1){
			fact  = fact * i;
		    factorial(i-1);
		}
	    
	}
}
















