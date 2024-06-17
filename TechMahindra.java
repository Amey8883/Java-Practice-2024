// // class TechMahindra
// // {
// // 	public static void main(String[] args) {
// // 		for(int i=1;i<=50;i++)
// // 		{
// // 			isPrime(i);
// // 		}
// // 	}

// // 	public static void isPrime(int num)
// // 	{
// // 		boolean flag = true;
// // 		for(int i=2;i<num;i++)
// // 		{
// // 			if(num%i==0){
// // 				flag=false;
// // 				break;
// // 			}
// // 		}

// // 		if(flag){
// // 			System.out.println(num+" - Prime");
// // 		}else{
// // 			System.out.println(num+" -not Prime");
// // 		}
// // 	}
// // }

// class TechMahindra{
// 	public static void main(String[] args) {
// 		boolean flag = true;
// 		int rem,sum=0;
// 		int num=52793;
// 		for(i=2;i<num;i++){
// 			if(num%i==0){
// 				flag=false;
// 			}
// 			else{
// 				System.out.println("Not prime");
// 			}
// 		}
// 	}

// 	if(flag){
// 		while(num!=0){
// 			rem=num%10;
// 			sum  = sum+rem;
// 			num = num/10;
// 		}
// 		System.out.print(sum);
// 	}
// }


import java.util.Array;
class TechMahindra{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int num = sc.nextInt();
		System.out.print("Enter number2: ");
		int num1 = sc.nextInt();
		System.out.println(num+" "+rotate(num,key));
	}

	public static int rotate(int num,int key)
	{
		String str=" "+num;
		int length = str.length();
		String str1=" ";
		for(int i=1;i<=key;i++)
			str1+=num;

		for(int i=0;i<length;i++){
			str1+=str.charAt(i+key);
			return.Integer.parseInt(str1);
		}
	}
}