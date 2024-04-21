class HollowPyramid {
    public static void main(String[] args) {
        // int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == 5 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


//         *
//       * *
//     *   *
//   *     *
// * * * * *























// class HollowPyramid{
// 	public static void main(String[] args) {
// 		for(int i=1;i<=5;i++){
// 			for(int j=1;j<=5-1;j++){
// 				if(i==5 || j==5 || i==j){
// 					System.out.print(" ");
// 				}else{
// 					System.out.print("*");
// 				}
// 			}
// 					System.out.println();

// 		}
// 	}
// }