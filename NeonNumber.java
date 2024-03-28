class NeonNumber{
	public static void main(String[] args) {
		int num = 9;
		int sqr = num * num;
		int sum = 0;
		while(sqr > 0)
		{
			int rem = sqr%10;  // 1
			sum += rem;        // 0 + rem = 1 
			sqr/=10;           // //
		}
		if(sum==num){
			System.out.println(num+" NEON NUMBER");
		}else{
			System.out.println(num+" NOT NEON NUMBER");
		}
	}
}