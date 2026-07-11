class Problem30{

    public static void main(String[] args)
    {
         int arr[]={12, 5, 18, 2, 9};
         int min=arr[0];
         int i=0;
         for(int i=0;i<arr.length;i++)
         {
              if(arr[i]<min)
              {
                  min=arr[i];
                  index=i;
               }
         }
    }
}