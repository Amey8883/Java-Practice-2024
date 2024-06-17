class Employee
{
	String name;
	int id;

	Employee(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
}

class EqualsDriver
{
	public static void main(String[] args) {
		Employee obj1 = new Employee("AMEY",1);
		Employee obj2 = new Employee("AJAY",2);

		System.out.println(obj1.equals(obj2));
		String str = "Hello";
		String str1 = new String("Hello");
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}
}