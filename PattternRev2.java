class PattternRev2{
	public static void main(String[] args) 
	{
		for(int i=1;i<=6;i++)
		{

			for(int j=1;j<=i-1;j++)
			 {
				System.out.print("* ");
			}

			for(int j=5;j>=i;j--)          
			{
				System.out.print("  ");
			}

			 
			System.out.println();
		}
		System.out.println();
		Patttern2.p2();
	}
}



class Patttern2{
	public static void p2() 
	{
		for(int i=1;i<=6;i++)
		{

			for(int j=1;j<=i-1;j++)
			 {
				System.out.print("  ");
			}

			for(int j=5;j>=i;j--)          
			{
				System.out.print("* ");
			}

			 
			System.out.println();
		}

		Patttern3.p3();
	}
}

class Patttern3{
	public static void p3() 
	{
		for(int i=1;i<=6;i++)
		{

			for(int j=5;j>=i;j--)          
			{
				System.out.print("* ");
			}

			for(int j=1;j<=i-1;j++)
			 {
				System.out.print("  ");
			}

			System.out.println();
		}

	Patttern4.p4();
	}
}


class Patttern4{
	public static void p4() 
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)          
			{
				System.out.print("  ");
			}

			for(int j=1;j<=i-1;j++)
			 {
				System.out.print("* ");
			}
			 
			System.out.println();
		}
		Pyramid.p5();
	
	}
	class Pyramid{
	public static void p5()
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		ReversePyramid.p6();

	}
	
}

class ReversePyramid{
	public static void p6()
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<6;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		RightPascalTriangle.p7();
	}
}

class RightPascalTriangle{
	public static void p7()
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}

			System.out.println();
		}

		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		LeftPascalTriangle.p8();

	}
}


 
 class LeftPascalTriangle{
 	public static void p8()
 	{
 		for(int i=1;i<=4;i++){
 			for(int j=3;j>=i;j--){
 				System.out.print(" ");
 			}

 			for(int j=1;j<=i;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}

 		for(int i=3;i>=1;i--){
 			for(int j=4;j>i;j--){
 				System.out.print(" ");
 			}
 			for(int j=1;j<=i;j++){
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		Diamond.p9();
 	}
 }

class Diamond{
	public static void p9()
	{
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<5;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

}