class Program28
{

   public static void main(String [] args)
   {
        String s1="hello i am java developer";
        String str[]=s1.split(" ");
        StringBuilder sb=new StringBuilder();
    
        for(int i=0;i<str.length;i++)
        {
           str[i]=str[i].substring(1);
           sb.append(str[i]);
           sb.append(" ");
        }
      System.out.println(sb);
   }
}