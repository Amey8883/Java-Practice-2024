public class SumOddIndex {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //1+3+5+7+9
                     
        // Calculate the sum of elements at even indices
        int oddSum = oddIndexSum(arr);
        // Print the result
        System.out.println("Sum of odd index element: "+oddSum);
    }

    // Method to calculate the sum of elements at even indices
    public static int oddIndexSum(int arr[])
    {
    	int sum=0;
    	for (int i=1; i<arr.length ; i+=2 ) {
    		sum+=arr[i];
    	}
    	return sum;
    }
}
