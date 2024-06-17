import java.util.*;
class ArrayOddExample1
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8};
		////find the count of odd element
		int count = 0;
		for(int i:arr)
		{
			if(i%2!=0)
				count++;
		}

	    int [] OddNumbers = new int[count];
	    //index var to store element in oddNumber array
	    int indx = 0;
	    //find odd and store in new Array
	    for(int i:arr)
	    {
	    	//check if elements is odd and store it by incrementing the indx by 1
	    	if(i%2!=0)
	    		OddNumbers[indx++]=i;
	    }
	    System.out.println(Arrays.toString(OddNumbers));
	}
}