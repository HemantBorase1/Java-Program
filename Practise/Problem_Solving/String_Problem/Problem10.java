class Problem10
{

   public static void main(String [] args)
   {
         String str="swiss";
         int count=0;
         for(int i=0;i<str.length();i++)
         {
              char c=str.charAt(i);
              for(int j=i+1;j<str.length();j++)
              {
                   if(c==str.charAt(i))
                   {
                      count++;
                   }
              }
           if(count==1)
           {
               System.out.println(c);
           }
         }
         
   }
}