class Problem5
{

   public static void main(String[] args)
   {
         int arr[]={1,2,-4,0,7,-1};
         int count=0;
         for(int i=0;i<arr.length;i++)
         {
              int check=arr[i];
              if(check>=0)
              {
                 count++;
              }
         }
       System.out.println(count);
   }
}