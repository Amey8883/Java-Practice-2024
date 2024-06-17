interface Arithimatic
{
	int add(int a,int b);
	int multi(int a,int b);
}

class InterfaceImplementation implements Arithimatic
{
	
	public int add(int a,int b)
	{
		return a+b;
	}

	public int multi(int a,int b)
	{
		return a*b;
	}
}

class InterfaceExample{
	public static void main(String[] args) {
		
	}
}