class Program13
{
    public static void main(String[] args)
    {
      String s1="International";
      String s2=s1.toUpperCase();
      
      StringBuilder sb1=new StringBuilder();
      StringBuilder sb2=new StringBuilder();
  
      for(int i=0;i<s1.length();i++)
      {
         char c=s2.charAt(i);
         if(!(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'))
            sb1.append(s1.charAt(i));
         else
            sb2.append(s2.charAt(i));

      }
      sb1.append(sb2);
      System.out.println(sb1);
    }
}