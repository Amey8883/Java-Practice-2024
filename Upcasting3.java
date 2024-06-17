class Parent
{
	void greeting()
	{
		System.out.println("Good Morning");
	}

	void m1()
	{
		System.out.println("Hello from m1()");
	}

	class Child extends Parent
	{
		void greeting()
		{
			System.out.println("Good Afternoon");
		}

		void m2()
		{
			System.out.println("Hello from m2()");
		}
	}
} 

class Upcasting3{
	public static void main(String[] args) {
		System.out.println("Hello word");
		Child obj = new Child();
		// obj.greeting();
		Parent obj1 = new Child();
		obj1.greeting();
		obj1.m1();
		// obj.m2();
	}
}