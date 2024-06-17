// class Foreach
// {
// 	public static void main(String[] args) {
// 		int [][] a = {{10,20,30},{40,50},{60,70,80,90}};
// 		for(int []i : a)
// 			for(int j : i)
// 				System.out.println(j);

// 			int i = 0;
// 			while(i<a.length)
// 			{
// 				i++;
// 				int j = 0;
// 				while(j<a.length)
// 				{
// 					j++;
// 				}
// 			}
// 	}
// }

class Foreach
{
	public static void main(String[] args) {
		int [][][] a = { {{10,20},{30}}, {40,50,60}};
		for(int [][]i : a)
			for(int j[][] : i)
				System.out.println(j);

			int i = 0;
			while(i<a.length)
			{
				i++;
				int j = 0;
				while(j<a.length)
				{
					j++;
				}
			}
	}
}