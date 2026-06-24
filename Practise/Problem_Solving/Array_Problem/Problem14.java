class Problem14
{

     public static void main(String[] args)
     {
           int arr[]={2,5,3,7,5,2};
           int found=arr[0];
           Boolean b=false;
    
           for(int i=0;i<arr.length-1;i++)
           {
               for(int j=arr.length-1;j>=i;j--)
               {
                       if(arr[i]==arr[j])
                       {
                              b=true;
                              found=arr[i];
                              break; 
                       }
                       else
                       {
                           b=false;
                       }
               }   
           }
          if(b)
          {
                  System.out.println("First Element that Repeats:"+found);
           }
          else
          {
                  System.out.println("No Repeated Elemnt Found.");
           }
         
     }
}