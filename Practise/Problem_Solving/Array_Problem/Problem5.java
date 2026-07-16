class Problem5
{

    public static void main(String[] args)
    {
         int arr[]={2, 5, 2, 8, 5, 7, 5};
         int found=0;

         for(int i=0;i<arr.length;i++)
         {
             for(int j=i+1;j<arr.length;j++)
             {
                  if(arr[i]==arr[j])
                  {
                       found=arr[j];
                       break;
                  }
             }
            break;
         }
         System.out.println(found);
    }
}