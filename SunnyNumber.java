import java.util.Scanner;
class SunnyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		boolean flag = false;
		int nums = num+1;
		int sqrrt = 0;
		for(int i=1;i<=nums/2;i++)
		{
			if(i*i==nums){
				flag=true;
				sqrrt=i;
				break;
			}
		}
		if(flag){
			System.out.println(sqrrt+" is a perfect sqrrt of num "+nums);
		}else{
			System.out.println(nums+" do not have a perfect sqrrt");
		}
	}
}