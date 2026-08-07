class Problem30
{

      public static void main(String[] args)
      {
            int arr[]={12,45,8,27,39};
            int max=0;
            int found1=0,found2=0;
            
            for(int i=0;i<arr.length;i++)
            {
                   for(int j=i+1;j<arr.length;j++)
                   {
                        if(arr[i]+arr[j]>max)
                        {
                             max=arr[i]+arr[j];
                             found1=i;
                             found2=j;
                        }
                   }
            }
          System.out.println(max);
          System.out.println("Pair:"+"("+arr[found1]+","+arr[found2]+")");
      }    
}