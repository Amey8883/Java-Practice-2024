class LargestNumUsingThreeOperands{
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 6;
		int num3 = 7;
		System.out.println ( "Max num is "+( (num1>num2) ? ((num1>num3) ? (num1):(num3)):((num2>num3) ? (num2) : (num3))));
	}
}