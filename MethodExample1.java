class MethodExample1{
	public static void main(String[] args) {
		System.out.println("Execution Starts");

		myMethod();          //myMethod() calling
		checkEvenOdd(10);    //checkEvenOdd() calling

		System.out.println("Execution ends");
	}

	public static void myMethod()         //Method
	{
		System.out.println("HELLO FROM myMethod()");
	}
	public static void checkEvenOdd(int num)  //Method
	{   
		if(num%2==0){
			System.out.println(num + " is even");
		}else{
			System.out.println(num + " is odd");
		}
	}
}