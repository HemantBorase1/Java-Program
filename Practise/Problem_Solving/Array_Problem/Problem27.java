class Problem27
{

   public static void main(String[] args)
   {
        int arr[]={4, 2, 7, 2, 9, 2};
        int target=2;
        int index=0;
        for(int i=arr.length-1;i>=0;i--)
        {
             if(arr[i]==target)
             {
                index=i;
                break;
             }
         }
       System.out.println(index);
   }
}