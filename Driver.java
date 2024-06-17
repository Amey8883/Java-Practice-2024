class Parent{
	abstract void m1()
	{
		System.out.println("Hello from parentm1");
	}
	abstract void m2()
	{
		System.out.println("Hello from parentm2");
	}
	abstract void m3()
	{
		System.out.println("Hello from parent3");
	}
}

class Child1 extends Parent{
	void m4()
	{
		System.out.println("Hello from child m4()");
	}

	void m5()
	{
		System.out.println();
	}
}
class Child2 extends Parent {
	void childm1()
	{
		System.out.println("Hello from child2 m1");
	}

	void childm2()
	{
		System.out.println("Hello from child2 m2");
	}

	void childm3()
	{
		System.out.println("hello from child2 m3");
	}
}

class Subchild1 extends childm1{
	subchildm1()
	{
		System.out.println("Subchild m1");
	}
	subchildm4()
	{
		System.out.println("Subchild m2");
	}
}

class Driver
{
	Child2 obj = new Child2();
	obj.childm1();
	obj.childm2();
	Subchild1 obj1 = new Subchild1();
	obj1.m1();
	obj1.m2();
	obj1.m3();
	obj1.m4();
	obj1.m5();
}