import java.util.*;
public class Main{
public static int removeDuplicate(int arr[]){
       int j=0;
    for(int i=0; i<arr.length;++i){
        
   
            if(arr[i]!=arr[j]){
                j++;
                 arr[j] = arr[i];
            
        }
        
    }
    return j+1;
}
public static void main(String args[]){
    int arr[]={1,1,2,2,3,3,4,4,5,5};
   int unique= removeDuplicate(arr);
     for(int i=0; i<unique;++i){
         System.out.print(" "+ arr[i]);
     }
    
}


}
//run on gdb complier or change the classname
//sks