class Problem17
{

    public static void main(String[] args)
    {
          int alphabets=0;
          int Digit=0;
          int SpecialChar=0;
 
          String str="Java121@#";
          for(int i=0;i<str.length();i++)
          {
                char c=str.charAt(i);
                if(Character.isLetter(c))
                {
                    alphabets++;
                }
                if(Character.isDigit(c))
                {
                    Digit++;
                }
                if(!Character.isLetter(c) && !Character.isDigit(c))
                {
                    SpecialChar++;
                }
          }
        System.out.println("Alphabets:"+alphabets+"\n Digits:"+Digit+"\n SpecialChar:"+SpecialChar);
    }
}