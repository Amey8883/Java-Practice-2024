abstract class Parent{
	abstract void m1();
	final void m2()
	{
		System.out.println("Hello from parent m2()");
	}
}

class Child extends Parent{
	void m1(){
		System.out.println("implementation to m1() by child");
	}

	// public final void m2(){
	// 	System.out.println("m2() override");
	// }
}

class FinalMethod{
	public static void main(String[] args) {
		Child obj = new Child();
		// obj.m2();
		obj.m1();
	}
}