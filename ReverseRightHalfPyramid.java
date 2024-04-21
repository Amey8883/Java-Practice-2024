class ReverseHollowLeftHalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == i || j == 1 || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// class ReverseRightHalfPyramid{
// 	public static void main(String[] args) {
// 		for (int i=1;i<=6 ; i++) {
// 			for (int j=5;j>=i;j--) {
// 				if(i==1 || j==1 || i==j){
// 				System.out.print("* ");
// 				}else{
// 					System.out.print(" ");
// 				}
// 			}
// 			// for(int j=1;j<=i-1;j++){
// 			// 	System.out.print("  ");
// 			// }
// 			System.out.println();
// 		}
// 	}
// }