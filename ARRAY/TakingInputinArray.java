
import java.util.*;
public class TakingInputinArray {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=scn.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements in the array");
        for(int i=0;i<size;++i){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<size;++i){
            System.out.print(arr[i]+" ");
        }
    }
}
