import java.util.Scanner;
class UncheckedException3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.next(); //error: incompatible types: String cannot be converted to int
	}
}