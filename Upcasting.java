class Parent
{
	void vehicle()
	{
		System.out.println("XUV");
	}

	void money()
	{
		System.out.println("Money: "+100000);
	}
}

class Child extends Parent
{
	void bike()
	{
		System.out.println("JAVA");
	}
}

class Upcasting{
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.vehicle();
		obj.money();
		// obj.bike();
	}
}