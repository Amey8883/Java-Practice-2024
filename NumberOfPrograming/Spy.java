class Spy{
	public static void main(String[] args) {
		int num = 1124;
		int sum = 0;
		int dup = num;
		int prdt = 1;
		
		while(num>0){
			int rem = num%10;
			sum += rem;
			prdt *= rem;
			num/=10;
		}
		System.out.println((prdt==sum)?dup+" SPY NUMBER":dup+" NOT A SPY NUMBER");
	}
}