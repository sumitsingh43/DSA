import java.util.*;
public class Main{
    
    public static int largest(int arr[]){
         if (arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }
        
        
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length ;++i){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8 ,7,88,99,999};
        System.out.print(" "+ largest(arr));
    }
}
// run it on online complier( gdb) or change the class name to run on ide like vs code
//sks