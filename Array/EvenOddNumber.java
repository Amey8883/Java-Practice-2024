class EvenOddNumber
{
	static int num =1;
	public static void main(String[] args) {
		evenNumbers();
	}

	public static void evenNumbers()
	{
		for (int i=num;i<=100;i++) {
			num++;
			return;
		
		if(num%2==0){
			System.out.print(num+" ");
		}
		evenNumbers();
	}
	}
}