import java.util.*;
public class Maxi {

     public static int search(int arr[]){
           int largest=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
              if(largest<arr[i]){
               largest=arr[i];
              }
           }
            return largest;
     }
      
    public static void main(String[] args) {
         int arr[]={10,20,30,40};
         System.out.println(search(arr));

    }
    
}
