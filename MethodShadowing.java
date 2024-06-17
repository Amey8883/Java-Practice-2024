class Ramesh
{
	public static void greeting()
	{
		System.out.print("Good Morning");
	}
}

class Suresh extends Ramesh
{
	public static void greeting()
	{
		System.out.print("Good afternoon");
	}
}

class MethodShadowing{
	public static void main(String[] args) {
		Suresh obj = new Suresh();
		obj.greeting();
	}
}