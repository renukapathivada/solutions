import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int Z=sc.nextInt();
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int res = 0;
            int suse = Math.min(X, A); 
            res += suse;
            X -= suse;
            A -= suse;
            int luse = Math.min(Y, B); 
            res += luse;
            Y -= luse;
            B -= luse;
            int eluse = Math.min(Z, C); 
            res += eluse;
            Z -= eluse;
            C -= eluse;
            int lxl = Math.min(Z, B); 
            res += lxl;
            Z -= lxl;
            B -= lxl;
            int sXL = Math.min(Z, A); 
            res += sXL;
            Z -= sXL;
            A -= sXL;
            int sL = Math.min(Y, A); 
            res += sL;
            Y -= sL;
            A -= sL;
            System.out.println(res);
		}

	}
}
