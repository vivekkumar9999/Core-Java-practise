// program for find greater of two numbers

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
          System.out.println("enter your first number:");
          System.out.println("enter your second number:");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          if(a>b){
            System.out.println("a is greater");
          }
           else{
             System.out.println("b is gretaer");
           }    }
    
}
