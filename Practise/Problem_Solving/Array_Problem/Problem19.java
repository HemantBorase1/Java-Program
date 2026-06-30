class Problem19
{
    public static void main(String[] args)
    {
          int arr[]={12, 5, 18, 2, 9};

          int max=arr[0];
          int min=arr[0];

          for(int i=0;i<arr.length;i++)
          {
               if(max<arr[i])
               {
                   max=arr[i];
               }
               if(arr[i]<min)
               {
                   min=arr[i];
                }
          }        
        System.out.println("Max:\t"+max+"\nMin:\t"+min);
    }
     
}