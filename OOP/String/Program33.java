class Program33
{
    public static void main(String[] args)
    {
          String str="gibblegabbler";
          char c=' ';
          for(int i=0;i<str.length();i++)
          {
                for(int j=i+1;j<str.length();j++)
                {
                      if(str.charAt(i)!=str.charAt(j))
                      {
                            c=str.charAt(i);
                            break;
                      }
                }
          }
        System.out.println("The First Non Repeated Character in String is: "+c);
     }
}