class Program7
{
   public static void main(String[] args)
   {
        String s1="International";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
             sb.append(s1.charAt(i));
             sb.append(i+1);
        }
     System.out.println(sb);
   }
}