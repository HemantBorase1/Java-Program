// This Program Removes the Special Character from the String.
class Program21
{
     public static void main(String[] args)
     {
         String s1="hello nayan?? where is nitin??";
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<s1.length();i++)
         {
              char c =s1.charAt(i);
              if(Character.isLetterOrDigit(c)|| Character.isWhitespace(c))
                  sb.append(c);
         }
       System.out.println(sb);
     }
}