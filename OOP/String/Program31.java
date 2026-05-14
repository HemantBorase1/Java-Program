class Program31
{

    public static void main(String[] args)
    {
          String str="successes";
          char c='';
          for(int i=0;i<str.length();i++)
          {
                 for(int j=i+1;j<str.length();j++)
                 {
                        if(str.charAt(i)==str.charAt(j))
                        {
                              c=charAt(i);
                        }
                 }
          }
        System.out.println("The Second Most Frequent char in the String is:"+c);
    }
}