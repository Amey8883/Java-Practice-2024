class Parent{
	public void Business()
	{
		System.out.print("Cloth business");
	}
}

class Child extends Parent{
	public void Business()
	{
		System.out.println("Restaurant Business");
		super.Business();
	}
}

class MethodOverriding
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.Business();
	}
}