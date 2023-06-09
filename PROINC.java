/*Chef recently started selling a special fruit.
He has been selling the fruit for X rupees (X is a multiple of 100). He earns a profit of 
Y rupees on selling the fruit currently.

Chef decided to increase the selling price by 
10
%
10%. Please help him calculate his new profit after the increase in selling price.

Note that only the selling price has been increased and the buying price is same. */

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
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int buy=x-y;
		     x=x*(10 + 100)/100;
		    int y1=x-buy;
		    System.out.println(y1);
		}
	}
}
