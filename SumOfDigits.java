import java.util.*;
class SumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digits: ");
		int num = sc.nextInt();
		int sum = 0;
		int originalNum = num;

		while(num>0){
			int rem = num%10;
			sum += rem;
			// rev = rev*10/num;
	        num /= 10;
		}
		System.out.println("Sum of digits "+ originalNum +" is:"+sum);
	}
}