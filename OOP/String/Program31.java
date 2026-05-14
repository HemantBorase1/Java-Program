class Program31
{

    public static void main(String[] args)
    {
          String str="successes";
          char c=' ';
          for(int i=0;i<str.length()-1;i++)
          {
                        if(str.charAt(i)==str.charAt(i+1))
                        {
                              c=str.charAt(i);
                              break;
                        }
                 
          }
        System.out.println("The Second Most Frequent char in the String is:"+c);
    }
}