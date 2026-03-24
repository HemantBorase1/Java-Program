class Program72
{
    public static void main(String[] args)
    {
     int n=5;
      for(int i=n;i>=1;i--)
      {
         for(int j=5;j>=1;j--)
         {
            if(i<j) // 4<5  // f 
            {
             System.out.print(i);
            }
            else
            {
             System.out.print(j);
            }
         }
     System.out.println();
      }
    }

}