import java.util.*;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();   //121
		int dup = num;
		int rev = 0;

		while(num>0){
			int rem = num%10;   //1  2  1  
			rev = rev*10+rem;   //0*10+1=1  12
			num/=10;            //12 1
		}
		System.out.println((dup==rev)?"Palindrome Number":"Not a Palindrome");

	}
}


