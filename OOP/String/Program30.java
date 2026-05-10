class Program30
{

// This will be only for Dry Run the Code.
   public static void main(String[] args)
   {
        String s1="Hello World";
        String str[]=s1.split(" ");
        for(int i=0;i<str.length;i++)
        {
             String word=str[i];
             for(int j=0;j<word.length();j++)
             {
                  System.out.println(word.charAt(j));
              }
        }
    }
}