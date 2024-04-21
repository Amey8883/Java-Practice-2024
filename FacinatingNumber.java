import java.util.Scanner;
class FascinatingNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num1 = sc.nextInt();
		int num2 = num1*2;
		int num3 = num1*3;

		String concat = " "+num1+num2+num3;

		boolean flag = true;

		for(char ch = '1'; ch<='9';ch++)
		{
			int count = 0;
			for (int i=0;i<concat.length();i++) {
				char ch2 =concat.charAt(i);
				if(ch2==ch)
					count++;
			}
			if(count > 1 || count == 0)
				flag = false;
		}
		System.out.println(flag?num1+" is a Facinating Number":num1+" is not Facinating Number");
	}
}


