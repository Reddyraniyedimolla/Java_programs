/*Alice and Bob went to a pet store. There are 
N animals in the store where the i th
  animal is of type A i
​ .

Alice decides to buy some of these 
N animals. Bob decides that he will buy all the animals left in the store after Alice has made the purchase.

Find out whether it is possible that Alice and Bob end up with exactly same multiset of animals.*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    HashMap<Integer,Integer> hm = new HashMap<>();
		    for(int i = 0; i < n; i++){
		      int k = sc.nextInt();
		      hm.put(k,hm.getOrDefault(k,0) + 1);
		    }
		    boolean isTrue = true;
		    for(Integer i : hm.keySet()){
		        if(hm.get(i)%2 != 0){
		            isTrue = false;
		        }
		    }
		    if(isTrue){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
		

