import java.util.*;
class Student 
{
	String name;
	String place;
	String branch;
	Student(String name,String place,String branch)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
	}
	@Override
	public String toString()
	{
		return "Hi my name is "+this.name+" and I belongs to "+this.place + " and I have completed my "+this.branch;
	}
}

class ExampleDriver2{
	public static void main(String[] args) {
		Student obj1 = new Student("Ramesh","Pune","Mechanical");
		System.out.println(obj1);
		Student obj2 = new Student("Mahesh","Mumbai","Civil");
		System.out.println(obj2);
		Student obj3 = new Student("Suresh","Pune","ENTC");
		System.out.println(obj3); 
	}
}