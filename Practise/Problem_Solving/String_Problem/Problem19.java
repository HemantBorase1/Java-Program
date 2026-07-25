class Problem19
{

      public static Boolean isPalindrome(String str)
      {
          String rev="";
          boolean b=false;
          for(int i=str.length()-1;i>=0;i--)
          {
               rev+=str.charAt(i);
          }
          if(rev.equals(str))
          {
              b=true;
          }
        return b;
      }
      public static void main(String[] args)
      {
           String str="madam level java noon";
           String words[]=str.split(" ");
           int count=0;
           for(int i=0;i<words.length;i++)
           {
                 String word=words[i];
                 if(isPalindrome(word))
                 {
                       count++;
                 }      
           }
          System.out.println(isPalindrome("nayan"));
          System.out.println(count);
      }
}