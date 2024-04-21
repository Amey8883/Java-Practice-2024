class NonStaticMethod{
	public static void main(String[] args) {
		
	}

	public void m1()
	{
		System.out.println("Hello from demo m1()");
		Demo1 obj = new Demo1();
		obj.m2()
	}
}

class Demo1
{
	public void m2()
	{
		System.out.println("Hello from demo1 m2()");
	    
	}

	public void m3()
	{
		System.out.println("Hello from demo1 m3()");
	}
}