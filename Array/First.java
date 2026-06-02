import java.util.*;
public class First{
     public static void main(String[] args) {
        int arr[]=new int[60];
        Scanner sc=new Scanner(System.in);
         arr[0] =sc.nextInt();
         arr[1]=sc.nextInt();
         arr[2]=sc.nextInt();
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);

         System.out.println("length of array is="+arr.length);

         System.out.println("percentege is :"+arr[0]+arr[1]+arr[2]/3);
     }

}