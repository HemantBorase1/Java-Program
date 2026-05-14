class Program32
{

    public static void main(String[] args)
    {
          String str="w3resource";
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<str.length();i++)
          {
             sb.append(i);
          }
          for(int i=0;i<str.length();i++)
          {
               for(int j=i+1;j<str.length();j++)
               {
                     if(str.charAt(i)==str.charAt(j))
                     {
                           sb.deleteCharAt(j);
                     } 
               }
          }
         String str2=sb.toString();
         System.out.println(str2);
    }
}