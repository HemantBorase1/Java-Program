class Problem20
{

    public static void main(String[] args)
    {
         int arr[]={4,9,2,15,7};
         int f=6;
         int counter=0;
         for(int i=0;i<arr.length;i++)
         {
               if(arr[i]>f)
               {
                  counter++;
               }
          }
        System.out.println(counter);
    }
}