class Problem7
{

   public static void main(String[] args)
   {
           String str="Java is Easy";
           int count=1;
           for(int i=0;i<str.length();i++)
           {
                  char c=str.charAt(i);
                   if(c==' ')
                   {
                        count++;
                   }
           }
         System.out.println("Total Number of Words in String:"+count);
   }
}