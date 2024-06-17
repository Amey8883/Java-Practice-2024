class Parent{
	String str1 = "hi from parent class";
	void m1()
	{
		System.out.println("Hello from parent m1()");
	}
	static void m3()
	{
		System.out.println("Hello from m3() static parent");
	}
}

class Child extends Parent
{
	String str2 = "Hi from child class";
	void m2()
	{
		System.out.println("Hello from child class m2()");
	}
	static void m4()
	{
		System.out.println("Hello from m4() static child");
	}
}

class Inheritance
{
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.str1);
		obj.m1();
		obj.m2();
		System.out.println(obj.str1);
		obj.m3();
		obj.m4();
	}
}