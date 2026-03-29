class Program89
{

   public static void main(String [] args)
   {
          int n=5;
      for(int i=1;i<=n;i++)  // 2<=5
      {
          for(int j=i;j>1;j--)  // 1>1
          {
            System.out.print(" ");
          }
          for(int j=n;j>=i;j--) // 2>=2
          {
            System.out.print(j);
          }
          for(int j=i+1;j<=n;j++) // 5<=5
          {
            System.out.print(j);
          }
       System.out.println();
      }
     
   }
}

/*
543212345
 5432345
  54345
   545
    5
*/