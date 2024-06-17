interface Parent1
{
	void m1()
	{
		System.out.println("Hello from m1()");
	}
}

interface Parent2
{
	void m2()
	{
		System.out.println("Hello from m2()");
	}
}

interface Child extends Parent1,Parent2
{
	void m3()
	{
		System.out.println("Hello from child m3()");
	}
}

class InterfaceDriver{
	
}