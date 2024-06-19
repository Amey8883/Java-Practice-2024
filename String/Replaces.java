import java.util.*;
class Replaces
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.println("Enter the Character To remove The Occurances");
		String ch = sc.next();

		String modified = input.replace(ch," ");
		System.out.println(modified);
	}
}