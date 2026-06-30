class Problem19
{

     public static void main(String[] args)
     {
           char f='a';
           String str="banana";
           int index=0;
           for(int i=0;i<str.length();i++)
           {
                  char c=str.charAt(i);
                  if(f==c)
                  {
                       index=i;
                  }
            }
           System.out.println(index);
     }
}