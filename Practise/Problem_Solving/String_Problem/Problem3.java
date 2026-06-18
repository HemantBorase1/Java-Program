class Problem3
{
 
   public static void main(String[] args)
   {
         String str="HElLO";
          int count=0;
         for(int i=0;i<str.length();i++)
         {
            char ch=str.charAt(i);
             if(Character.isUpperCase(ch))
             {
                count++;
             }
         }      
         System.out.println("Total Count of UpperCharacter:"+count);
   }
}