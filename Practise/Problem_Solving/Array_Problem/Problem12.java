class Problem12
{

     public static void main(String[] args)
     {
         int arr1[]={5, 8, 12, 20};
         int arr2[]={5, 8, 12, 20};
         Boolean b=false;
         if(arr1.length==arr2.length)
         {
               for(int i=0;i<arr1.length;i++)
               {
                      if(arr1[i]==arr2[i])
                      {
                           b=true;
                      }
                      else
                      {
                           b=false;
                           break;
                      }
 
               }
         }
         if(b)
         {
                System.out.println("Equal");
         }
         else
         {
                System.out.println("Not Equal");
          }
     }
}