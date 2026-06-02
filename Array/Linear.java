public class Linear {
     public static int linearSearch( int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
         return -1;
     }
    public static void main(String[] args) {
         int arr[]={2,3,4,5,6,7,8,8,9,10};
         int key=6;
           int ans=linearSearch(arr, key);
           if(ans==-1){
            System.out.println("not found");
           }
            else{
                System.out.println("key is at:"+ans);
            }
    }
    
}
