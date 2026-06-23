class Problem10
{

  public static void main(String[] args)
  {
         int arr[]={7,9,10,11};
         Boolean b=false;
         for(int i=0;i<arr.length-1;i++)
         {
             if(arr[i]<arr[i+1])
             {
                  b=true;
             }
             else{
                 b=false;
                 break;
             }       
         }
       if(b)
       {
             System.out.println("Array is Sorted.");
       }
       else{
             System.out.println("Array is Not Sorted.");
       }
  }
}