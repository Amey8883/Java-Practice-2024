//WaJP to get ASCII value from String dynamically
import java.util.*;
class MethodExample2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String name = sc.next();

		for (int i=0; i<name.length() ; i++ ) 
		{
			char name2 = name.charAt(i);
			int asciiName = name2; //widening
			System.out.print(asciiName+" ");
		}
	}
}