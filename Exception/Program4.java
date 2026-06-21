class Program4
{
 
   public static void main(String[] args)
   {
           try
           {
            System.out.println("Statement-1");
            System.out.println(10 / 0);    // ArithmeticException
            System.out.println("Statement-2");
            
            int arr[] = {10, 20, 30};
            System.out.println(arr[3]);
           }
           catch(ArithmeticException e)
           {
                  System.out.println(e);
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
                 System.out.println(e);
           }
           catch(Exception e)
           {
                 System.out.println(e);
           }
   }
}