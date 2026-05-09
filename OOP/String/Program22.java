class Program22
{
   public static void main(String[] args)
   {
      String s1="Never odd or even";
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s1.length();i++)
      {
           char c =s1.charAt(i);
           if(Character.isLetterOrDigit(c))
                  sb.append(c);
      }
      if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
            System.out.println("String is Palindrome.");
      else
            System.out.println("String is not Palindrome.");
   }
}