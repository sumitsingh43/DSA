import java.util.*;
public class Main{
    public static int findkey(int arr[], int key){
        for(int i=0;i<arr.length;++i){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,8,9,77,0,9};
        int key=9;
        int ky= findkey(arr,key);
        if(ky==-1){
            System.out.print("not found");
        }
        else{
            System.out.print("key is at index"+ " "+ ky);
        }
    }
}