import java.util.*;
class eg1
{
	public static void main(String[] args) {
		int [][] a = new int[2][];
		a[0] = new int[3];
		a[1] = new int[3];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 20;
        a[1][0] = 10;
        a[1][1] = 20;
        a[1][2] = 30;        
        System.out.println(Arrays.deepToString(a));


        int [][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[1];
        b[2] = new int[2];

        b[0][0] = 10;
        b[0][1] = 20;
        b[1][0] = 10;
        b[2][0] = 10;
        b[2][1] = 20;
        System.out.println(Arrays.deepToString(b));


        int [][][] c = new int[2][2][2];
        c[0][0][0] = 10;
        c[0][0][1] = 20;

        c[0][1][0] = 30;
        c[0][1][1] = 20;

        c[1][0][0] = 20;
        c[1][0][1] = 20;
        c[1][1][0] = 20;
        c[1][1][1] = 20;
        System.out.println(Arrays.deepToString(c));


        int [][][] d = new int[2][2][];
        d[0][0] = new int[1];
		d[0][1] = new int[2];
		d[1][0] = new int[1];
		d[1][1] = new int[3];

        d[0][0][0] = 10;
        d[0][1][0] = 20;
        d[0][1][1] = 30;
        d[1][0][0] = 10;
        d[1][1][0] = 20;
        d[1][1][1] = 30; 
        d[1][1][2] = 30; 
         
        System.out.println(Arrays.deepToString(d));


        int [][][] e = new int[2][][];
        e[0] = new int[3][1];
        e[1] = new int[2][];
		e[1][0] = new int[2];
		e[1][1] = new int[3];

        e[0][0][0] = 10;
        e[0][1][0] = 20;
        e[0][2][0] = 20;
        e[1][0][0] = 10;
        e[1][0][1] = 20;
        e[1][1][0] = 30;        
        e[1][1][1] = 30;        
        e[1][1][2] = 30;        
        System.out.println(Arrays.deepToString(a));


        int [][][] f = new int [3][][];
        f[0] = new int[1][2];
        f[1] = new int[2][2];
        f[2] = new int[3][2];
        f[0][0] = new int[2];
        f[1][0] = new int[2];
        f[1][1] = new int[2];
        f[2][0] = new int[2];
        f[2][1] = new int[2];
        f[2][2] = new int[2];

        f[0][0][0] = 10;
        f[0][0][1] = 20;

        f[1][0][0] = 30;
        f[1][1][1] = 30;

        f[1][1][0] = 30;
        f[1][1][1] = 30;
        
        f[2][0][0] = 10;
        f[2][0][1] = 10;
        
        f[2][1][0] = 10;
        f[2][1][1] = 10;

        f[2][2][0] = 10;
        f[2][2][1] = 10;

        System.out.println(Arrays.deepToString(f));

 	}
}