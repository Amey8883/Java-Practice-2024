//WAJP to convert the first letter into capital and rest into lowercase
import java.util.*;
class MethodExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = sc.next().toLowerCase();

		String firstLetter = name.substring(0,1).toUpperCase();
		String remainingLetters = name.substring(1,name.length());
		String merge = firstLetter.concat(remainingLetters);
		System.out.println(merge);
		System.out.println(remainingLetters);
		System.out.println(firstLetter);
	}
}