import java.util.*;
class stringarray
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name = sc.next();
	char[] arr = m1(name);
	System.out.println(Arrays.toString(arr));

	// char [] arr1 = name.toCharArray();
	// System.out.println(Arrays.toString(arr1));				
	}

	public static char[] m1(String name)
	{
		char []arr = new char[name.length()];
		for(int i = 0;i<name.length();i++)
		{
			arr[i]=(name.charAt(i));
		}
		return arr;
	}
	
}