class Program29
{

    public static void main(String[] args)
    {
       String s1="hello i am java developer";
       String str[]=s1.split(" ");
       StringBuilder sb=new StringBuilder();
       
       for(int i=0;i<str.length;i++)
       {
             String word=str[i];
             StringBuilder sb2=new StringBuilder();
             for(int j=0;j<word.length();j++)
             {
                  char c=word.charAt(j);
                  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                  {
                       sb.append("");
                       sb2.append(word.charAt(j));
                  }
                  else
                  {
                      sb.append(word.charAt(j));
                  }
             }             
            sb.append(" ");
            sb.append(sb2);
        }
       System.out.println(sb);
    }
}