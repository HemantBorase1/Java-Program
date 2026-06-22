class Program7
{

    public static void main(String[] args)
    {
             try
             {
                 System.out.println(10/0);
             }
             catch(ArithmeticException e)
             {
                    throw new ArithmeticException("Division by Zero is Not Allowed.");
             }
     }
}