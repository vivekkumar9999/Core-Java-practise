public class Reverse {
    public static void reve( int number[] ){
        int first=0;
        int end=number.length-1;

         while(first<end){
            int temp=number[end];
             number[end]=number[first];
             number[first]=temp;
             first++;
             end--;
         }
    }

    public static void main(String[] args) {
   int number[]={2,3,4,5,6};
         reve(number);
         for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
         }
          System.out.print("  ");
        
    }
    
}
