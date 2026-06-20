class Problem6
{

   public static void main(String[] args)
   {
         int arr[]={10,20,7,80,50};
         int max=arr[0];
         int secondmax=arr[0];
         for(int i=0;i<arr.length;i++)
         {
               if(max<arr[0])
               {
                   max=arr[0]; 
               }else if(arr[i]<max)
               {
                   secondmax=arr[i];
               }
               else
                   System.out.println();
         }
       System.out.println(secondmax);
   }
}

// Dry Run the Code Again & then Solve it.