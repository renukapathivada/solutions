import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int K=sc.nextInt();
		    int d=Math.abs(X-Y);
		    if(d==K){
		        System.out.println(0);
		    }else if (d < K) {
                System.out.println((K - d) % 2 == 0 ? (K - d) / 2 : -1);
            } 
            else {
                System.out.println((d - K) % 2 == 0 ? (d - K) / 2 : -1);
            }
		    
		}

	}
}
