class FactorsUsingRecursion{
	static int num = 20;
	public static void main(String[] args) {
		factors(1);
	}

	public static void factors(int i)
	{
		if(i<=num){
			if(num%i==0)
			{
				System.out.println(i+" factors"+num);
			}
			factors(i+1);
		}
	}
}


