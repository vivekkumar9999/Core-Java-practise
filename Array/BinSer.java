public class BinSer {
     public static int BinarySearch(int number[],int key){
          int start=0;
          int end=number.length-1;
          while(start<=end){
           int mid=(start+end)/2;

            if(number[mid]==key){
                return mid;

            }
             if(number[mid]<key){
                mid=mid+1;
             }
             else{
                end=mid-1;
             }
          }
           return -1;
     }

    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60};
        int key=30;
        System.out.println(BinarySearch(number, key));
    }
    
}
