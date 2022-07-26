import java.util.*;
class main{
    public static void main(String args[]) throws Exception{
        int arr[] = {20,15,26,2,98,6};
        int n = arr.length;
        
        int brr[] = new int[n];
        for(int i=0;i<n;i++){
            brr[i]=arr[i];
        }
        
        Arrays.sort(brr);
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int temp = 1;
        for(int i=0;i<n;i++){
            if(hm.get(brr[i])==null){
              hm.put(brr[i],temp);
              temp++;
            }
        }
        for(int i=0;i<n;i++)
           System.out.print(hm.get(arr[i])+" ");
        

    }
}
