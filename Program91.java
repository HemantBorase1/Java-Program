class Program91
{
     public static void main(String[] args)
     {
          int n=5;
         for(int i=1;i<=n;i++)  // 1<=5
         {
                for(int j=i;j<n;j++)   // 1<5
                {
                 System.out.print(" ");
                }
                for(int j=i;j>=1;j--)  // 1>=1
                {
                 System.out.print(j);
                }
                for(int j=1+1;j<=i;j++)
                {
                 System.out.print(j);
                }
           System.out.println();
         }
     }

}

/*
    1
   212
  32123
 4321234
543212345

*/