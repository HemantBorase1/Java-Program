class Program23
{
   public static void main(String[] args)
   {
      String s1 = "hello i am java developer";

      String s2[] = s1.split(" ");

      StringBuilder sb = new StringBuilder();
      StringBuilder sb1 = new StringBuilder();

      for(int i = 0; i < s2.length; i++)
      {
         sb.append(s2[i].substring(1));
         sb1.append(s2[i].charAt(0));
         sb.append(" ");
      }

      sb.append(sb1);

      System.out.println(sb);
   }
}