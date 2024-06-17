class Parent
{
	static int b=20;
}

class Child extends Parent
{
	static int a=10;
}

class ClassCastException{
	public static void main(String[] args) {
	try{
		Parent obj2 = new Parent();
		Child obj = (Child) obj2;
	}		
	
	catch(Exception e)
	{
		System.out.println("error handled");
	}
}

}