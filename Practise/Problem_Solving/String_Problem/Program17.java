class Program17
{

    public static void main(String[] args)
    {
          String str1="programming";
          String str2="program";
          boolean isPrefix=true;
          if(str2.length()>str1.length())
          {
                isPrefix=false;
          }
          else
          {
               for(int i=0;i<str2.length();i++)
               {
                  if(str1.charAt(i)!=str2.charAt(i))
                  {
                       isPrefix=false;
                       break;
                  }
               }
          }
         System.out.println(isPrefix ? "Yes":"No");
    }
}