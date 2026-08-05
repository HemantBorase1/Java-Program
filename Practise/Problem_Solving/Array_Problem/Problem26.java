class Problem26
{

    public static void main(String[] args)
    {
         int arr[]={7, 1, 5, 3, 6, 4};
         int maxdiff=2;
         for(int i=0;i<arr.length;i++)
         {
              for(int j=i+1;j<arr.length;j++)
              {
                   int diff=arr[i]-arr[j];
                   if(diff>maxdiff)
                   {
                        maxdiff=diff;
                   }
              }
         } 
         System.out.println(maxdiff);
    }
}