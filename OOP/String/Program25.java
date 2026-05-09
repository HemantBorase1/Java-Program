class Program25
{

   public static void main(String[] args)
   {
        String s1="Welcome to 2026";
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
          char c =s1.charAt(i);
          if(Character.isDigit(c))
              count++;
        }
      System.out.println(count);
   }
}