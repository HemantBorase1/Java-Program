class Problem15
{

    public static void main(String[] args)
    {
           int arr[]={10,67,25,7,3};
           int min=arr[0];
           int Secmin=0;
           for(int i=0;i<arr.length;i++)
           {
               if(min>arr[i])
               {
                     Secmin=min;
                     min=arr[i];
               } 
           }
         System.out.println(min+"\t "+Secmin);
    }
}