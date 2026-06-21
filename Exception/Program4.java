class Program4
{
 
   public static void main(String[] args)
   {
           try
           {
                System.out.println(10/0);
                int arr[]={10,20,30};
                System.out.println(arr[3]);
           }
           catch(ArthmeticException e)
           {
                  System.out.println(e);
           }
           catch(Exception e)
           {
                 System.out.println(e);
           }
   }
}