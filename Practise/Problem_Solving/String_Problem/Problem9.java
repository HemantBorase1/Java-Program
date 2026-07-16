class Problem9
{

      public static void main(String[] args)
      {
            String str1="listen";
            String str2="silent";
            Boolean b=false;
            if(str1.length()==str2.length())
            {
                  
                  for(int i=0;i<str1.length();i++)
                  {
                        int count=1;
                        for(int j=0;j<str2.length();j++)
                        {
                             if(str1.charAt(i)==str2.charAt(j))
                             {
                                   count++;
                             }
                        }
                     if(count==2){
                        b=true;
                     }
                     else
                     {
                           b=false;
                           break;
                      }
                  }
            }
           
            if(b)
            {
                System.out.println("Anagram");
             }
            else
            {
                  System.out.println("Not Anagram");
             }
      }
}