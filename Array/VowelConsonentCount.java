import java.util.*;
class VowelConsonentCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size  = sc.nextInt();

		System.out.println("Enter array elements: ");
		char [] arr = new char[size];


		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}

		int vowelCount = 0;
		int vConsonent = 0;

		for(int i=0;i<size;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
			{
				vowelCount++;
			}
			else
			{
				vConsonent++;
			}
		}
		System.out.println("Vowels: "+vowelCount);
		System.out.println("Consonent: "+vConsonent);


	}
}