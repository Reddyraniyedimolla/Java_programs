/* You know that 
1
1 kg of pulp can be used to make 
1000
1000 pages and 
1
1 notebook consists of 
100
100 pages.

Suppose a notebook factory receives 
 
N kg of pulp, how many notebooks can be made from that?*/

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
	    int n=sc.nextInt();
	    int p=n*1000;
	    System.out.println(p/100);
	}// your code goes here
	}
		// your code goes here
	}

