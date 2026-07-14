class Problem3
{

     public static void main(String[] args){
            
          int arr[]={7, 10, 15, 20, 18};
          int evenCount=0;
          int oddCount=0;
          for(int i=0;i<arr.length;i++)
          {
               if(arr[i]%2==0)
               {
                    evenCount++;
               }
               else
               {
                   oddCount++;
               }
           }
          System.out.println("EvenCount:"+evenCount+"\n OddCount:"+oddCount);
     }
}