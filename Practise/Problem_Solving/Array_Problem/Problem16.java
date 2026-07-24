class Problem16
{

     public static void main(String[] args)
     {
          int arr[]={4,7,4,9,4,2};
          int target=4;
          int count=0;
          for(int i=0;i<arr.length;i++)
          {
               if(arr[i]==target)
               {
                   count++;
               }
          }
         System.out.println(count);
     }
}