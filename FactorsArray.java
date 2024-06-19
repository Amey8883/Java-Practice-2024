import java.util.Arrays;

class FactorsArray {
    public static void main(String[] args) {
        int num = 12;
        int factorCount = 0;

        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }

        // Initialize the factors array with the correct size
        int[] factorsArray = new int[factorCount];
        int index = 0;

        // Populate the factors array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsArray[index++] = i;
            }
        }

        // Print the factors array
        System.out.println(Arrays.toString(factorsArray));
    }
}
