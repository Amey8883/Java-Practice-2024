import java.util.Scanner;
class LengthOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 123;
		int length = 0;

		//1.  i=123;123>0(t)
		//2.  12>0(t);123/10(12)
		//3.  1>0(t);12/10(1)
		//4.  0>0(f);1/10(0)

		for(int i=num;i>0;i/=10){
			length++;
			// 1. 0(1)
			// 2. 1(2)
			// 3. 2(3);
		}
		System.out.println(length);   //3
	}
}