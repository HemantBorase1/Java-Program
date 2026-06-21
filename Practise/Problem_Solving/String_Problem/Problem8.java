class Problem8
{

   public static void main(String[] args)
   {
         String str="banana";
         char key='a';
         int count=0;
         for(int i=0;i<str.length();i++)
         {
              char c=str.charAt(i);
              if(c==key)
              {
                  count++;
              }
         }
      System.out.println("Total Occurance in the String:"+count);
   }
}