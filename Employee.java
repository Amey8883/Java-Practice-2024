class Employee1{
	String name;
	long phone;
	double salary;
	String address;
	Employee(String name,long phone,double salary,String address)
	{
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.address = address;
	}
	@Override
	protected void finalize()
	{
		System.out.println("Object got destroyed");
	}

	void displayDetails()
	{
		System.out.println("Name is: "+this.name);
		System.out.println("Phone is: "+this.phone);
		System.out.println("salary is: "+this.salary);
		System.out.println("address is: "+this.address);
	}
}

class Employee{
	public static void main(String[] args) {
		Employee1 obj = new Employee1("Amey",8087842752,123.76,"pune");
		System.out.println(obj.name);
		obj = null;
		System.gc();
		System.out.println(obj.name);
	}
}