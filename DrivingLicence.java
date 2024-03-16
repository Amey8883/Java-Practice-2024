import java.util.Scanner;
class DrivingLicence{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();

		if(age>=18){
			
			System.out.print("Enter you (Pass or Fail) in exam ");
			String exam = sc.next().toUpperCase();
			System.out.print("Enter your marks");
			double marks = sc.nextDouble();
			if(exam.equals("YES") && marks>=60){
				System.out.print("congrats");
			}else{
				System.out.println("Re-appeared for exam");
			}
		}else{
			System.out.println("You are kid try after "+(18-age));
		}
	}
}