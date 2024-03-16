import java.util.Scanner;
class Election{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("Do you have a voter Id (Yes or No)");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println(" ***** WelCome *****");
				System.out.println("1. BJP");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");

				System.out.print("Enter the option to vote for your fav party");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP")){
					System.out.println("You have voted for BJP");
				}else if(vote.equals("Congress")){
					System.out.println("you have voted for Congress");
				}else if(vote.equals("AAP")){
					System.out.println("You have voted for AAP");
				}else if(vote.equals("MNS")){
					System.out.println("You have voted for MNS");
				}else if(vote.equals("ShivSena")){
					System.out.println("You have voted for ShivSena");
				}else if(vote.equals("NCP")){
					System.out.println("you have voted for NCP");
				}else if(vote.equals("NOTA")){
					System.out.println("thank you for wasting your time ");
				}

				else{
					System.out.println("Invalid input");
				}
			}else{
				System.out.println("jaldi niklo");
			}
		}else{
			System.out.println("you are not matured try after  "+(18-age)+" years");
		}

	}
}