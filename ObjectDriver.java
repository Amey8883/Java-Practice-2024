class Student{
	String sname;
	String place;
	String branch;

	Student(String sname,String place,String branch)
	{
		this.sname = sname;
		this.place = place;
		this.branch = branch;
	}
}
class ObjectDriver
{
	public static void main(String[] args) {
		Student obj1 = new Student("RAMESH","Pune","COMPUTER SCIENCE");
		Student obj2 = new Student("SURESH","Mumbai","Civil");
		System.out.println(obj1.equals(obj2));
	}
}
