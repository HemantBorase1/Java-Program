class Problem7
{

     public static void main(String[] args)
     {
           String str="Java123Full45";
           int count=0;
           for(int i=0;i<str.length();i++)
           {
                   char c=str.charAt(i);
                   if(Character.isDigit(c))
                   {
                        count++;
                   }
           } 
           System.out.println(count);
     }
}