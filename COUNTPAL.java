/*Each palindrome can be always created from the other palindromes, if a single character is also a palindrome. For example, the string "bobseesanna" can be created by some ways:
* bobseesanna = bob + sees + anna
* bobseesanna = bob + s + ee + s + anna
* bobseesanna = b + o + b + sees + a + n + n + a
...
We want to take the value of function CountPal(s) which is the number of different ways to use the palindromes to create the string s by the above method.  */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int mod=1;
	Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long[] pal = new long[n];
		pal[0] = 1;
		boolean[][] isPal = new boolean[n][n];
		for(int i = 1;i<n;i++){
		    for(int j = 0;j<=i;j++){
		        boolean check = (s.charAt(i)==s.charAt(j))&&(j+1>=i-1 || isPal[j+1][i-1]);
		        isPal[j][i] = check;
		        if(check){
		            if(j==0){
		                pal[i]++;
		            }
		            else{
		                pal[i] += pal[j-1];
		            }
		            pal[i]%=mod;
		        }
		    }
		}
		System.out.println(pal[n-1]);
	}
}
