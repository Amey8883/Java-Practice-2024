import java.util.*;
class DuckNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num = sc.next();
		if(num.charAt(0)=='0')
		{
			System.out.println(num+" is not a Duck Number");
		}else{
			System.out.println(num+" it is a Duck Number");
		}
	}
}