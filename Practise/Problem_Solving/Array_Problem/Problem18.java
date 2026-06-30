class Problem18
{
      public static void main(String[] args)
      {

         int arr[]={2,3,2,5,3,2};
           
         for(int i=0;i<arr.length;i++)
         {
              boolean visited=false;
              for(int k=0;k<i;k++)
              {
                   if(arr[i]==arr[k])
                   {
                       visited=true;
                       break;
                   }
              }
             if(visited){
   
                 continue;
             }
             int count=1;
             for(int j=i+1;j<arr.length;j++)
             {
                  if(arr[i]==arr[j])
                  {
                      count++;
                  }
             }
           System.out.println(arr[i]+":\t"+count+" times");
          }         
         }
         
      }
 // Dry Run it Repeadly
