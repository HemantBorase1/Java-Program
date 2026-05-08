
// This Program Can Print Highest Index String with the same count
class Program16
{
   public static void main(String[] args)
   {
     String s1="Welcome to International asdfghjklzxcv Airport";
     String s2[]=s1.split(" ");
     int max=0;
     for(int i=0;i<s2.length;i++)
     {
        String temp=s2[i];
        if(max<temp.length())
             max=temp.length();
     }
     for(int i=0;i<s2.length;i++)
     {
        String temp=s2[i];
        if(max==temp.length())
             System.out.println(temp);
     }
   }
}