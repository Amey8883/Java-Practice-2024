class NegativeNumbersUsingArray
{
	public static void main(String[] args) {
		int [] num = {-1,2,-3,-4,-5,6,8,2};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				System.out.println(num[i]);
			}
		}
	}
}