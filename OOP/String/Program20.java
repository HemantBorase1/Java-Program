class Program20
{

    public static void main(String args[])
    {
           String s1="hello i am java developer";
           String s2=s1.toUpperCase();
           StringBuilder sb=new StringBuilder();
           for(int i=0;i<s1.length();i++)
           {
                 char c=s2.charAt(i);
                 if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                        sb.append(c);
                 else
                        sb.append(s1.charAt(i));
           }

           System.out.println(sb);
    }
}