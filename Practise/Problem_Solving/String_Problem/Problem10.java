class Problem10
{

     public static void main(String [] args)
     {
           String str="Java@2026#Developer!";
           int count=0;
           for(int i=0;i<str.length();i++)
           {
                char c=str.charAt(i);
                if(!(Character.isDigit(c) || Character.isLetter(c)))
                {

                     count++;
                }
           }
         System.out.println(count);
     }
}