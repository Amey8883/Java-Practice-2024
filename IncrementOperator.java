class IncrementOperator{
	public static void main(String[] args) {
		// int a = 2;
		// int b = a++;
		// int c = ++a;
		// System.out.println(a+ ++b + ++c);

		int a = 3;
		int b = a++;
		int c = a++;
		System.out.println(a++ + b++ + c++ + a + b++ + c++ );
	}
}