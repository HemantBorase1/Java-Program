class Program27
{

   public static void main(String [] args)
   {
          String s1="hello i am java developer";
          String str[]=s1.split(" ");
          StringBuilder sb=new StringBuilder();
 
          for(int i=0;i<str.length;i++)
          {
              int size=str[i].length();
              sb.append(size);
              sb.append(str[i]);
              sb.append(" ");
          }

       System.out.println(sb);
   }
}