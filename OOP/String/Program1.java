class Program1
{

    public static void main(String[] args)
    {
            // codePointAt(int index)
            // Unicode value of char
 
            System.out.println("ABC".codePointAt(0));
            
           // codePointBefore(int index)
           //  Unicode before index
            System.out.println("ABC".codePointBefore(2));

          // codePointCount(int begin, int end)
          //  Count Unicode Characters
           System.out.println("ABCD".codePointCount(0,2));

          // equals(Object)
           System.out.println("a".equals("a"));
            
          
    }
}