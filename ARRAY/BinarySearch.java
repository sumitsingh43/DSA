public class BinarySearch {

    public static int bilinearSearch(int arr[],int key){
        int s=0,e=arr.length-1;
        
        while(s<=e){
            int mid = s + (e - s) / 2;  // this mid is better than below
//int mid=(s+e)/2;
           if(arr[mid]==key){
            return mid;
           } 
          else if(arr[mid]>key){
            e=mid-1;
           }
           else{
            s=mid+1;
           }
            
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,8};
        int key=4;
        int index=bilinearSearch(arr, key);
       
        System.out.println("index is at"+ " "+ index);
    
    }
}
