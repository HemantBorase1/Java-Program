class Problem17
{

     public static void main(String[] args)
     {
          int arr[]={2,0,5,0,8,1};
          int len=arr.length-1;
          for(int i=0;i<arr.length-1;i++)
          {
               if(arr[i]==0)
               {
                  
                  for(int j=i;j<arr.length-1;j++)
                  {
                       int temp=arr[j];
                       arr[j]+=arr[j+1];
                       arr[j+1]=temp;
                  }
                 
               }
          }
         for(int i=0;i<arr.length;i++)
         {
               System.out.println(arr[i]);
         }
     }
}