import java.util.Scanner;
class PassOrFail{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Percentage: ");
		double percentage = sc.nextDouble();

		if(percentage<35){
			System.out.println("You are fail");
		}
		else if(percentage<60){
			System.out.println("You are pass with second class");
		}else if(percentage<75){
			System.out.println("You are pass with first clsss");
		}else if(percentage<90){
			System.out.println("You are pass with Distinction");
		}
		else if(percentage<100){
			System.out.println("you are topper in college");
		}else{
			System.out.println("enter valid percentage");
		}

    	}

	}
