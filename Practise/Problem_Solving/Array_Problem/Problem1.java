class Problem1
{
    public static void main(String[] args)
    {
         int arr[]={4,11,6,9};
         int max=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]>max)
             {
                max=arr[i];
             }
         }
        System.out.println("Largest Element in the Array:"+max);
    }
}