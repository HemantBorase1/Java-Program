class Problem5
{

  public static void main(String[] args)
  {
       String str="Hello World  !!";
       int count=0;
       for(int i=0;i<str.length();i++)
       {
            char c=str.charAt(i);
            if(c==' ')
            {
                count++;
            }
       }
      System.out.println("Total Spaces in String:"+count);
  }
}