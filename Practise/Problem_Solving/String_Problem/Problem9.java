class Problem9
{
    public static void main(String[] args)
    {
          String str="java hello";
          String upper="";
          for(int i=0;i<str.length();i++)
          {
                 char c=str.charAt(i);
                 char u=Character.toUpperCase(c);
                 upper+=u;
    
          }
       System.out.println(upper);
    }
}