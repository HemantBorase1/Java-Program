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
          
    // Searching
    // indexOf(int / String)
    System.out.println("hello".indexOf("l"));
    
     // indexOf(String,fromIndex)
    System.out.println("Hello".indexOf("l",1));
     
     /*
        Let’s walk through this version:

🔹 Code:
System.out.println("Hello".indexOf("l", 2));
🔹 String with indexes:
H  e  l  l  o
0  1  2  3  4
🔹 What changes here?
Now the search starts from index 2
At index 2, the character is already 'l'

     */
   // lastIndexOf(String)
   System.out.println("Hello".lastIndexOf("l"));

  // 6.SubStrings
  // substring(int begin)
  System.out.println("hello".substring(2));

  // substring(int begin,int end)
  System.out.println("hello".substring(1,4));
  
  // subSequence(int,int)
  System.out.println("hello".subSequence(1,3));

   // 7.Combining & Modifying
   // concat(String)
   System.out.println("Hi".concat("Java"));

   // replace(char old,char new)
   System.out.println("apple".replace('p','b'));

   // replace(CharSequence, CharSequence)
   System.out.println("Hello".replace("ll","yy"));

   // replaceFirst(regex, new)
   System.out.println("a1b2".replaceFirst("\\d","X"));

   // replaceAll(regex,new)
   System.out.println("a1b2".replaceAll("\\d",""));
     
    }
}