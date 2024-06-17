// // abstract class Arithimatic{
// 	// public abstract void main(String[] args) {
		
// 	// }
	
// 	abstract class AbstractionExample
// 	{
// 		// public abstract void main(String[] args);
// 		abstract int addition(int num1,int num2);
// 				abstract int substraction(int num1,int num2);
// 						abstract int multiplication(int num1,int num2);
// 								abstract int division(int num1,int num2);
// 										abstract int modules(int num1,int num2);
// 	}
	
// 	class AbstractDriver
// 	{
// 		public int addition(int num1,int num2);
// 		System.out.println("addition"+int num1,int num2);
// 		public int substraction(int num1,int num2);
// 		System.out.println("substraction"+int num1,int num2);
// 		public int 3.
// 		System.out.println("multiplication"+);
// 	}

abstract class Arithimatic
{
	abstract int add(int num1,int num2);
		abstract int sub(int num1,int num2);
			abstract int mul(int num1,int num2);
				abstract int divi(int num1,int num2);
					abstract int modulo(int num1,int num2);
}

class ArthiImp extends Arithimatic
{
	int add(int num1,int num2)
	{
		return (num1+num2);
	}
	int sub(int num1,int num2)
	{
		return(num1-num2);
	}
	int mul(int num1,int num2)
	{
		return(num1*num2);
	}
	int divi(int num1,int num2)
	{
		return(num1/num2);
	}
	int modulo(int num1,int num2)
	{
		return(num1%num2);
	}
}

class AthiDriver{
	public static void main(String[] args) {
		ArthiImp obj = new ArthiImp();
		System.out.print(obj.add(10,20));
				System.out.print(obj.add(10,20));

		System.out.print(obj.add(10,20));
		System.out.print(obj.add(10,20));
		System.out.print(obj.add(10,20));

	}
}