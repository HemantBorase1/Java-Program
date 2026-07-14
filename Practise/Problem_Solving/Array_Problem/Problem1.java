class Problem1
{

    public static void main(String[] args)
    {
         int arr[]={14, 8, 25, 6, 17};
         int min=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]<min){
               min=arr[i];
             }
         }
        System.out.println(min);
    }
}