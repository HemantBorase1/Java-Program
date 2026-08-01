class Problem23
{

   public static void main(String[] args)
   {
        String str1="coding";
        String str2="coling";
        int count=0;
        if(str1.length()==str2.length())
        {
             for(int i=0;i<str1.length();i++)
             {
                  if(str1.charAt(i)!=str2.charAt(i))
                  {
                       count++;
                  }
             }

        }else
            System.out.println("No");
        if(count==1)
        {
            System.out.println("Yes ");
        }
        else
        {
             System.out.println("No");
        }
        
   }
}