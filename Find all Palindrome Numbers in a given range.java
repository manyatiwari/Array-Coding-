import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	
	
	public static void main (String[] args) throws java.lang.Exception
	{  
        int m = 10;
        int n = 50;
        for(int i=m;i<=n;i++){
           if(isPallindrome(i))
           System.out.print(i+" ");
        }}
        public static boolean isPallindrome(int n){
           int rev =0;
	       int j=n;
	    while(j>0){
	        int l = j%10;
	        rev = (rev*10)+l;
	        j=j/10;
	    }
	    if(n==rev)
	     return true;
	    else 
	     return false;
        
	}
}
