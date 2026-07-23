import java.lang.Math;
class Problem18
{

       public static void main(String[] args)
       {
           String str1="interview";
           String str2="internet";
           String prefix="";
           int len=Math.min(str1.length(),str2.length());
           for(int i=0;i<len;i++)
           {
                if(str1.charAt(i)==str2.charAt(i))
                {
                    prefix+=str1.charAt(i);
                }
                else
                {
                     break;
                }
           }
          System.out.println(prefix);
       }
}