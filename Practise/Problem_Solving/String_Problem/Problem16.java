class Problem16
{

     public static void main(String[] args)
     {
          String str="Java@2026!";
          int Uppercase=0;
          int Lowercase=0;
          int Digit=0;
          int SpecialChar=0;

          for(int i=0;i<str.length();i++)
          {
               char c=str.charAt(i);
               if(Character.isUpperCase(c))
               {
                   Uppercase++;      
               }
               else if(Character.isLowerCase(c))
               {
                   Lowercase++;
               }
               else if(Character.isDigit(c))
               {
                    Digit++;
               }
               else
               {
                     SpecialChar++;
               }
            
          }
         System.out.println("UpperCase:"+Uppercase+"\t"+"LowerCase:"+Lowercase+"\t"+"Digit:"+Digit+"\t "+"SpecialChar:"+SpecialChar);
     }
}