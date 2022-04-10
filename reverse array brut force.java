/* package codechef; // don't place package name! */

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i =0;i<N;i++){
		    A[i] = sc.nextInt();
		}
		 
		 int start=0;
		 int end=N-1;
		 while(start<end){
		     int temp = A[start];
		     A[start] = A[end];
		     A[end] = temp;
		     start++;
		     end--;
		 }
		 for(int i =0;i<N;i++){
            System.out.print(A[i]+" ");}
	
	System.out.println();
	T--;
	}
}
}