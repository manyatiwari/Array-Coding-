/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n = 8;
	    int arr [] = {1,2,3,1,2,3,4,5};
	    
	    HashMap<Integer,Integer> map = new HashMap<>();
	    
	    for(int i =0;i<n;i++){
	        if(map.containsKey(arr[i]))
	          map.put(arr[i],map.get(arr[i])+1);
	        else 
	          map.put(arr[i],1);
	    }
	    
	    for(Map.Entry<Integer,Integer> entry : map.entrySet())
	       System.out.println(entry.getKey() + " " +entry.getValue());
		
		
	}
}
