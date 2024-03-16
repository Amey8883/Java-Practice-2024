import java.util.Scanner;
class DonateBlood{
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int age = sc.nextInt();

	if(age<20){
		System.out.println("You are a kid Try after "+(20-age)+"years");
		}else{
			System.out.println("you have consumed alcohol ,cigarette (yes/no)");
			String nasha = sc.next().toLowerCase();
		    if(nasha.equals("no")){
			System.out.println("enter weight");
			double wght = sc.nextDouble();
			if(wght>=50){
				System.out.println("denate blood");
			}else {
				System.out.println("Go and have some food and increase your weight");
			}
		}else{
			System.out.println("you can not donate blood because are in nasha");
		}
}
}
}
