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
          
         // compareTo(String)
         System.out.println("apple".compareTo("apple"));
            
        /* 
compareTo() compares characters one by one using their Unicode values.

'a' = 97
'A' = 65

So the comparison starts with:

'a' - 'A' = 97 - 65 = 32

Since the very first characters are different, Java stops there and returns 32.

Key takeaway:
Lowercase letters have higher Unicode values than uppercase letters
So "apple" is considered greater than "APPLE"

        */

     // Prefix / Suffix
     // Syntax: startsWith(String)
    System.out.println("Java".startsWith("Ja"));

    // startsWith(String,int offset)
    System.out.println("Hello".startsWith("ll",2)); 

    // endsWith(String)
    System.out.println("Java".endsWith("va")); 
          
    }
}