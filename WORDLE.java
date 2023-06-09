/*Chef invented a modified wordle.

There is a hidden word S and a guess word T, both of length 5.
Chef defines a string M to determine the correctness of the guess word. For the 
i th index:

If the guess at the i th index is correct, the i character of M is G.
If the guess at the i th index is wrong, the i th character of M is B.
Given the hidden word S and guess T, determine string m.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    String n=sc.next();
		    String e="";
		    for(int j=0;j<5;j++)
		    {
		        if(s.charAt(j)==n.charAt(j))
		        {
		            e=e+"G";
		        }
		        else{
		            e=e+"B";
		        }
		    }
		    System.out.println(e);
		}
	}
}

