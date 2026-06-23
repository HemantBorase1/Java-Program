class Problem11
{

   public static void main(String[] args)
   {
         String str="programming";
         char find='g';
         int count=0;
         for(int i=0;i<str.length();i++)
         {
               char c=str.charAt(i);
               if(find==c)
               {
                   count++;
               }
         }
         System.out.println(count);
   }
}