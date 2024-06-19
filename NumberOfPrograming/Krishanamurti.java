class Krishanamurti{
	public static void main(String[] args) {
		int num = 145;
		int sum = 0;
		int dup = num;
		while(dup != 0)
		{
			int rem = dup % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
				
			}
			sum += fact;
				dup/=10;
		}
		System.out.println((sum == num)? num+ " is Krishanamurt number" : num+ " is not Krishanamurt number");
	}
}