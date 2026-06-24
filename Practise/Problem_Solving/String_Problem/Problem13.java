class Problem13
{

    public static void main(String[] args)
    {

        String str="Hello Java Program";
        String str2="";
 
        for(int i=0;i<str.length();i++)
        {
              char c=str.charAt(i);
               if(c==' ')
               {
                 continue;
               }
               else
               {
                     str2+=str.charAt(i);
               }
        }
       System.out.println(str2);
     }
}