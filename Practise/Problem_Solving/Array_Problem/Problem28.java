class Problem28
{
 
   public static void main(String[] args)
   {
          int arr[]={2, 5, 8, 7, 10};
          int EvenSum=arr[0];
          int OddSum=arr[0];
 
          for(int i=0;i<arr.length;i++)
          {
                if(arr[i]%2==0)
                {
                     EvenSum+=arr[i];
                }
                else
                {
                     OddSum+=arr[i];
                }
          }
          int diff=EvenSum-OddSum;
          System.out.println(diff);
    }
}