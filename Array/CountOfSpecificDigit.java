import java.util.*;
class CountOfSpecificDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size  = sc.nextInt();

		System.out.println("Enter array elements: ");
		int [] arr = new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		int count=0;
		System.out.println("enter the Number you want to get the count: ");
		int num = sc.nextInt();
		for (int i=0; i<size ; i++)
		{
			if(arr[i]==num)

			{
				count++;
			}
		}

		System.out.println("Count of Number is : "+count);
	}
}