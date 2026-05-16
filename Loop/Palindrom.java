public class Palindrom {
    public static void main(String[] args) {
        int rev=0;
        int rem;
       
        int no=121;
         int temp=no;
        while(temp!=0){
           rem=temp%10;
           rev=rev*10+rem;
           temp=temp/10;
        }
         if(no==rev){
            System.out.println("this is palindrm ");
         }
          else{
            System.out.println("not a palindrm");
          }
    }
    
}
