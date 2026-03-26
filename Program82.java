class Program82
{
   
   public static void main(String [] args)
   {
      int n=5;
    for(int i=1;i<(n*2)-1;i++)
    {
        if(i<=n)
        {
         for(int j=i;j<=n;j++) 
         {
           if(i%2!=0)
             { System.out.print((char)(i+96)); }
           else
             { System.out.print((char)(i+64)); }
         }
       }
      else
      {
          for(i<=n)
          {
            for(int j=i;j<=(n*2)-1;j++)
            {
                System.out.print(i);
             }
           }
        
      }
    System.out.println();
    }
    
   }

}