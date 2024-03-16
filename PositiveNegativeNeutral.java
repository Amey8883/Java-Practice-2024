

// else{
// 			System.out.println("invalid input");
// 		}

import java.util.Scanner;
class PositiveNegativeNeutral{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number: ");
		double num = sc.nextDouble();

		if(num>0){
			System.out.println("number is postive");
		}else {
			System.out.println("invalid input");
		    if(num<0){
			System.out.println("number is negative");
		}else if(num == 0){
			System.out.println("number is neutral");
		}
	}
	}
}
