import java.util.*;
class StoreFindEvenOddNegativeFindElement
{

	static int arr[];

	public int[] Store(int size)

	{
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];

        this.arr = arr;
        System.out.println("Enter "+ size +" elements: ");
        for(int i = 0;i<size;i++)
        {
        	arr[i] = sc.nextInt();
        }
        return arr;
	}

	public void Even(int arr[])
	{
		System.out.print("Even Numbers: ");
		for(int even: arr)
		{
			if(even % 2 == 0)
				System.out.print(even +", ");
		}
		System.out.println();
	}

	public void Odd(int arr[])
	{
		System.out.print("Odd Numbers: ");
		for(int odd: arr)
		{
			if(odd % 2 != 0)
				System.out.print(odd+", ");
		}
		System.out.println();
	}

	public void Negative(int arr[])
	{
		System.out.print("Negative Numbers: ");
		for(int negative: arr)
		{
			if(negative < 0)
				System.out.print(negative+", ");
		}
		System.out.println();
	}

	public void FindElement(int arr[],int find)
	{
		boolean found = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == find)
			{
				System.out.println("Element found: "+arr[i]);
				found = true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Element not found: ");
		}
	}

	public static void main(String[] args) 
	{
		StoreFindEvenOddNegativeFindElement obj = new StoreFindEvenOddNegativeFindElement();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while(flag)
		{
			System.out.println("1.Store Elements \n 2.Find Element \n 3.Find Even Numbers \n 4.Find odd Numbers \n 5.Find Negative Number \n");
			System.out.print("Choose option: ");
			int choose = sc.nextInt();

			switch(choose)
			{
			case 1: 
				{
					System.out.print("How many elements you wanna store: ");
					int size = sc.nextInt();
					int[] arr = obj.Store(size);
				}
				break;

			case 2:
				{
					System.out.print("Number to find: ");
					int find = sc.nextInt();
					obj.FindElement(arr,find);
				}
				break;

			case 3:
				{
					obj.Even(arr);
				}
				break;

			case 4:
				{
					obj.Odd(arr);
				}
				break;

			case 5:
				{
					obj.Negative(arr);
				}
				break;

			case 6:
				{
					System.out.print("Exit: ");
					flag = false;
					System.exit(0);
				}
				break;

			default: System.out.println("Error choose correct option");
				break;
			}
		}
	}
}
