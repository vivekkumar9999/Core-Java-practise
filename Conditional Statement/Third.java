// program for check even or odd

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("your number is even");
        }
         else{
            System.out.println("your number is odd");
         }
    }
    
}
