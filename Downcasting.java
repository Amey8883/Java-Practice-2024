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

class Downcasting 
{
	public static void main(String[] args) {
		Parent obj = new Child(); //upcasting
		obj.greeting(); //Good Afternoon
		obj.m1();  // Hello from m1()
		Child obj1 = (Child) obj;  //down casting
		obj1.m2();   //Hello from m2()
	}
}