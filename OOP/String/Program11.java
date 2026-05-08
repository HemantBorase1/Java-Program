class Program11
{
    public static void main(String[] args)
    {
        String s1="International";
        String s2=s1.toUpperCase();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
           char c=s2.charAt(i);
           if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
               count++;
        }
     
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
             char c=s2.charAt(i);
             if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                sb.append(count--);
             else
                sb.append(s1.charAt(i));
   
        }
      System.out.println(sb);
    }
}