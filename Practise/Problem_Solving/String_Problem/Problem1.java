class Problem1
{
       public static void main(String[] args)
       {
              String str="Education";
              int count=0;
              String vowels="AEIOUaeiou";
              for(int i=0;i<str.length();i++)
              {
                    for(int j=0;j<vowels.length();j++)
                    {
                         if(str.charAt(i)==vowels.charAt(j))
                         {
                             count++;
                         }
                    }
              }
             System.out.println("Total Vowels in the String:"+count);
       }
}