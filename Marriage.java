import java.util.Scanner;
class EligibalToMarry{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age: ");
		int age = sc.nextInt();
		System.out.print("eneter property: ");
		double prop = sc.nextDouble();
		System.out.print("enter the surname: ");
		String surname = sc.next().toUpperCase();

		if( (age>=21 && prop >= 10000000) || (surname.equals("amBaNi") ) )
		{
			System.out.println("you are eligible");
		}
		else {
			System.out.println("You are not eligible");
		}
	}
}