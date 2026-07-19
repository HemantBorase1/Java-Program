class Problem15
{

    public static void main(String[] args)
    {
           String str="success";
           int index=0;
           for(int i=0;i<str.length();i++)
           {
               int count=1;
               char ch=str.charAt(i);
               for(int j=i+1;j<str.length();j++)
               {
                     if(ch==str.charAt(j))
                     {
                          count++;
                      }
                }
                if(count>2)
                {
                     index=i;
                     break;
                }
                
           }
           System.out.println(str.charAt(index));
     }
}