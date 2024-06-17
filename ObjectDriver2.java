class Human implements Cloneable{
	String name;
	String place;
	String gender;
	String profession;
	Human(String name,String place,String gender,String profession){
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.profession = profession;
	}
	public String toString()
	{
		return this.name+" "+this.place
	}
}