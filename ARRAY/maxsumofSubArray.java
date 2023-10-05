import java.util.*;
public class Main{
    
    public static int maxsumofSubArray(int arr[]){
        
        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<arr.length;++i){
            int start=i;
            for(int j=i;j<arr.length;++j){
                int end=j;
                    int sum=0;
                for(int k=start;k<=end;++k){
                  sum+=arr[k];
                }
                if(sum>max){
                   max=sum;
    
            }
            
        }
        
        }
        return max;
            
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
       int smax=subarray(arr);
       System.out.println(smax);
    }
}
