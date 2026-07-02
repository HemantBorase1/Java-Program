class Problem22
{

     public static void main(String[] args)
     {
          int index=0;
          int arr[]={12, 45, 8, 30, 21};
          int max=arr[0];
          for(int i=0;i<arr.length;i++)
          {
               if(arr[i]>max)
               {
                   max=arr[i];
                   index=i;
               }
          }
        System.out.println("Max Element Present At:"+index);
     }
}