// creat a calculator by using switch case
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        int num1=sc.nextInt();
         System.out.println("enter your second number");
        int num2=sc.nextInt();

        System.out.println("enter your symbol '+','-','*','%'");
        char symbol=sc.next().charAt(0);
       
        switch (symbol) {
            case '+':
                System.out.println("your addition is ="+num1+num2);
                               break;
            case '-':
                System.out.println("your substraction is="+(num1-num2));
                               break;      
            case '*':
                System.out.println("your multiplication is="+(num1*num2));
                               break;
            case '%':
                System.out.println("your divison="+(num1%num2));
                               break;                       
        
            default:
                System.out.println("you choose wrong symbol");
                               break;
        }
    }
    
}
