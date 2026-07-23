class Program17
{

    public static void main(String[] args)
    {
          String str1="programming";
          String str2="program";
          Boolean b=false;
          int count=0;
          for(int i=0;i<str2.length();i++)
          {
               if(str2.charAt(i)==str1.charAt(i))
               {
                     b=true;
                     count++;
               }
               else
               {
                    if(count==0)
                    {
                         b=false;
                         break;
                    }
               }
          }
         if(b)
         {
             System.out.println("Yes");
         }
         else
         {
             System.out.println("No");
          }
    }
}