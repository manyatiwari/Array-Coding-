/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    
	    for(int i=0;i < n;i++)
	       num.add(sc.nextInt());
	       
	   Collections.sort(num);
	   
	   for(int i=0;i < (n/2);i++)
	     System.out.print(num.get(i) + " ");
	   
	   for(int i = n-1;i>=n/2;i--)
	     System.out.print(num.get(i) + " ");
		
	}
}
