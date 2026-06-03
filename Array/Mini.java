import java.util.*;
public class Mini {
     public static int mini( int number[]){

         int smallest=Integer.MAX_VALUE;
          for(int i=0;i<number.length;i++){
              if(smallest>number[i]){
                smallest=number[i];
              }
          }
           return smallest;
     }
    public static void main(String[] args) {
          int number[]={12,13,14,11,10,9};
          System.out.println(mini(number));
    }
    
}
