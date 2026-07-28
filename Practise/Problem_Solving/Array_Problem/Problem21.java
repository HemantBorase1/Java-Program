class Problem21
{

     public static void main(String[] args)
     {
          int arr[]={2, 2, 1, 2, 3, 2, 2};
          int count=0;
          boolean found=false;
          for(int i=0;i<arr.length;i++)
          {
                count=1;
               for(int j=i+1;j<arr.length;j++)
               {
                   if(arr[i]==arr[j])
                   {
                       count++;
                   }
               }
              if(count>(arr.length/2))
              {
                   System.out.println(arr[i]);
                   found=true;
                   break;
              }
          }
          if(!found)
          {
                 System.out.println(-1);
          }
     }
}