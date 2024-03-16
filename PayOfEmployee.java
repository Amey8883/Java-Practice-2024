import java.util.Scanner;
class PayOfEmployee{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the pay of employee: ");
		double pay = sc.nextDouble();

		System.out.print("Enter the monthlyTargetScore: ");
		double monthlyTargetScore = sc.nextDouble();
		
		if(monthlyTargetScore>90){
			pay = pay + pay*3/100;
		}
		else{
        pay=pay+pay*1/100;
         }
         System.out.println("total"+pay);
	}
}