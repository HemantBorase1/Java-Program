class Problem12
{

   public static void main(String[] args)
   {
         int arr[]={2,5,7,10,2,9};
         int found=0;
         Boolean b=false;
         for(int i=0;i<arr.length;i++)
         {
              for(int j=i+1;j<arr.length-1;j++)
              {
                   if(arr[i]==arr[j])
                   {
                      found+=arr[i];
                      b=true;
                      break;
                    }
                  
              }
         }
         if(b)
         {
              System.out.println("Duplicate Element:"+found);
         }
         else
         {
                System.out.println("No Duplicate Element in the Array.");
         }
   }
}