import java.util.Arrays;

class MergeTwoArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));
        
        int length = a.length + b.length;
        int result[] = new int[length];
        
        // Copy elements of the first array
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        
        // Copy elements of the second array
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
