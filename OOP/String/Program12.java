class Program12
{
   public static void main(String[] args)
   {
     String s1="International";
     String s2=s1.toUpperCase();
     StringBuilder sb=new StringBuilder(s1);
 
     int count=0;
     for(int i=sb.length()-1;i>=0;i--)
     {
      char c =s2.charAt(i);
      if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
      {
         sb.deleteCharAt(i);
         sb.insert(i,++count);
      }
     }
    System.out.println(sb);
   }
}