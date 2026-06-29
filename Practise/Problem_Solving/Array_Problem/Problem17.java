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
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
                   if(arr[len]==0)
                   {
                      break;
                   }
               }
          }
         for(int i=0;i<arr.length;i++)
         {
               System.out.println(arr[i]);
         }
     }
}