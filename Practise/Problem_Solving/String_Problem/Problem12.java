import java.util.*;
class Problem12
{
    public static void main(String[] args)
    {
        String str1="silent";
        String str2="listen";
        Boolean s=true;
      
        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
       
        Arrays.sort(a);
        Arrays.sort(b);
 
        for(int i=0;i<a.length;i++)
        {
             if(a[i]!=b[i]){
               s=false;
               break;
          }
        }

        if(s)
        {
             System.out.println("String is Anagram.");
        }
        else
        {
                System.out.println("String is not Anagram.");
         }
       
     
        }
       
    }
