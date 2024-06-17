import java.util.Scanner;
import java.util.*;
class StoreEvenAndOdd{
public static void main(String[] args) 
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Array Size:");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter The Array element:");
    int evenCount = 0;
	int oddCount = 0;
    for(int i=0;i<size;i++)
    {
    	arr[i] = sc.nextInt();
    }

    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2==0)
    	{
    		evenCount++;
    	}else
    	{
    		oddCount++;
    	}
    }

    int [] oddArr = new int[oddCount];
    int [] evenArr = new int [evenCount];

    int idx1 = 0,idx2 = 0;

    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2==0)
    	{
    		evenArr[idx1++] = arr[i];
    	}else{
    		oddArr[idx2++] = arr[i];
    	}
    }

    System.out.println("Even numbers: "+Arrays.toString(evenArr));
    System.out.println("Odd numbers: "+Arrays.toString(oddArr));

}
}	