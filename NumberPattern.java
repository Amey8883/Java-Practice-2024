class NumberPattern {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            int currentNum = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum + " ");
                currentNum--;
            }
            num += i + 1;
            System.out.println();
        }
    }
}