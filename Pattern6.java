class Pattern6
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--)
		{
			for(int j=i-1;j>=1;j--)
				System.out.print(" ");

			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();

			for(int m=5;m<=1;m--)
			{
				for(int n=m-1;n<=m;n++){
					System.out.print(" ");
				}

				for(int n=1;n<=m;n--){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}




         //     *
         //    * *
         //   * * *
         //  * * * *
         // * * * * * 
         //  * * * *
         //   * * * 
         //    * *
         //     *