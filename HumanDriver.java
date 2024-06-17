class Human{
	String name;
	String gender;

	Human(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}

	
	void eat()
	{
		System.out.println("HUMAN CAN EAT");
	}
	void walk()
	{
		System.out.println("HUMAN CAN WALK");
	}
	void think()
	{
		System.out.println("HUMAN CAN THINK");
	}
	void speak()
	{
		System.out.println("HUMAN CAN SPEAK");
	}

	void displayHuman()
	{
		System.out.println("****Human****");
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
	}
}

class Graduation extends Human{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course=course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}

	void displayGraduation()
	{
		System.out.println("****Graduation Details****");
		System.out.println("course: "+this.course);
		System.out.println("duration:"+this.duration);
		System.out.println("branch: "+this.branch);
		System.out.println("university: "+this.university);
		System.out.println("Year of passout: "+this.yop);
	}
}

class PostGraduation extends Graduation{
	String specialization;
	int durationpg;
	int yoppg;
	String universitypg;
	PostGraduation(String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super( course, duration, branch, university, yop, name, gender);
		this.specialization=specialization;		
		this.durationpg=durationpg;
		this.yoppg=yoppg;
		this.universitypg=universitypg;
	}

	void displayPostGraduation()
	{
		System.out.println("****PostGraduation Details****");
		System.out.println("specialization: "+this.specialization);
		System.out.println("duration: "+this.duration);
		System.out.println("year of passout pg: "+this.yoppg);
		System.out.println("University: "+this.university);
	}
}

class Job extends PostGraduation{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company,double salary,String designation,String location, String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(specialization,durationpg,yoppg,universitypg, course, duration, branch, university, yop, name, gender);
		this.company=company;
		this.salary=salary;
		this.designation=designation;
		this.location=location;
	}

	void displayJob()
	{
		System.out.println("****Job Details****");
		System.out.println("Company: "+this.company);
		System.out.println("salary: "+this.salary);
		System.out.println("designation: "+this.designation);
		System.out.println("loctaion: "+this.location);
	}
}
class HumanDriver{
	public static void main(String[] args) {
	// Job(String company,double salary,String designation,String location, String specialization,int durationpg,int yoppg,int universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)

		Job obj = new Job("TCS",4.5,"Developer","Pune","Cyber security",2,2026,"SPPU","Mechanical",4,"Enginnerringf","SPPU",2028,"AMey","Male");
		obj.displayHuman();
		obj.eat();
		obj.walk();
		obj.speak();
		obj.think();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
	}
}