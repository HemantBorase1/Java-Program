class Program15
{
   public static void main(String[] args)
   {
       String s1="welcome to international airport";
       String s2[]=s1.split(" ");
       String max=s2[0];
       for(int i=1;i<s2.length;i++)
       {
            String temp=s2[i];
            if(max.length()<=temp.length())
                  max=temp;
       }
      System.out.println(max);
   }
}