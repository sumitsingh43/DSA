import java.util.*;
public class Main{
    public static int factorial(int arr){
   int fact=1;
   for(int i=arr;i>=1;--i){
       fact*=i;
   }
   return fact;
    }
    
    public static void main(String args[]){
        int arr=5;
       System.out.print(" " + factorial(arr));
    }
}
//sks