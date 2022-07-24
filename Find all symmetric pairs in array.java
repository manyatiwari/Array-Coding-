import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

class Main{
    public static void main(String args[]) throws Exception{
        int arr[][] = new int[5][2];
        arr[0][0] = 11; arr[0][1] = 20;
        arr[1][0] = 30; arr[1][1] = 40;
        arr[2][0] = 5;  arr[2][1] = 10;
        arr[3][0] = 40;  arr[3][1] = 30;
        arr[4][0] = 10;  arr[4][1] = 5;
        findSymPairs(arr);
        
    }
    
    public static void findSymPairs(int arr[][]){
        
        HashMap <Integer,Integer> hm = new HashMap<>();
        
        //travesing the HashMap
        for(int i=0;i<arr.length;i++){
            int first = arr[i][0]; //storing the first element, i will change but 0 index remains same
            int sec = arr[i][1]; // storing the second element same as first one
            
            Integer val = hm.get(sec); //looking for second element of this pair in hashmap
            
            if(val!=null && val == first) // checking if the value of this element and the consecutive first element is same or not
                System.out.println(first + "," + sec);
            else 
              hm.put(first,sec); // adding the pair in array incase it dosent exist 
            
        }
    }
}

