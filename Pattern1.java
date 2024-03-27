class Pattern1
{
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1;i<=5;i++)
		{
			a = a + i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a-- +" ");
			}
			a = a + i;
			System.out.println(); 
 		}
	}
}

// 1
// 3 2
// 6 5 4
// 10 9 8 7
// 15 14 13 12 11