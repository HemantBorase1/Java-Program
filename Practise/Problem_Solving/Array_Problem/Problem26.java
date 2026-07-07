class Problem26
{

      public static void main(String[] args)
      {
           int arr[]={5, 8, -2, -9, 10};
           int found=0;
           for(int i=0;i<arr.length;i++)
           {
                  if(arr[i]<0)
                  {
                       found=arr[i];
                       break;
                  }
           }
           System.out.println(found);
      }
}