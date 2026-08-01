class Problem23
{

      public static void main(String[] args)
      {
            int arr[]={2,4,6,8};
            int count=0;
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
               sum+=arr[i];      
            }
            int avg=(sum/arr.length);
            for(int i=0;i<arr.length;i++)
            {
                 if(arr[i]<avg)
                    count++;
            }
           System.out.println(count);
      }
      
}