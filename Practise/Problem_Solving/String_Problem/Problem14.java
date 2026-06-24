class Problem14
{

    public static void main(String[] args)
    {
           String str="banana";
           int count=0;
           char c=str.charAt(0);
           for(int i=0;i<str.length();i++)
           {
                for(int j=i+1;j<str.length()-1;j++)
                {
                       if(str.charAt(i)==str.charAt(j))
                       {
                              count++;
                       }
                }
               if(count>1)
               {
                 c+=str.charAt(i);
                }
               else
               {
                    c+=str.charAt(i);  
                }
           }
         System.out.println(c);
   // Try Using the Array for Calculating or Storing the Int ARRAY
    }
}