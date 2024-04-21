 public class DemoExample3{
	public static void main(String[] args) {
		System.out.println("Hello from DemoExample3");
		DemoExample4.ramesh();
		suresh();
	}
	public static void suresh()
	{
		System.out.println("Hi from Suresh");
	}
}
 class DemoExample4
{
	public static void ramesh()
	{
		DemoExample5.mahesh();
		System.out.println("Hello from DemoExample4 m1()");
	}
}

class DemoExample5{
	public static void mahesh()
	{
		System.out.println("Hello from DemoExample5");
	}
}