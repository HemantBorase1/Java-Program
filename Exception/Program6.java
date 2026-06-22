class Program6
{

   public static void main(String[] args)
   {
         try
         {
                System.out.println("Outer Try ");
                try
                {
                     System.out.println("Inner Try-Block.");
                 }
                catch(Exception e)
                {
                       System.out.println(e);
                 }
                finally
                 {
                     System.out.println("Inner Finally.");
                  }
         }
         catch(Exception e)
         {
               System.out.println(e);
         }
         finally
         {
                System.out.println("Outer Finally");
          }
   }
}