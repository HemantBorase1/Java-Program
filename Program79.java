class Program79
{

/*

5
54
543
5432
54321
5432
543
54
5

*/
public static void main(String[] args)
{
   int n=5;
  for(int i=1;i<=(n*2)-1;i++)     // 6<=9
  {
        if(i<=n) // 5<=5
        {
            for(int j=n;j>=n-i+1;j--)  // 1>=1
            {
              System.out.print(j);
            }
        }
       else
        {
              for(int j=n;j>=i-n+1;j--) // 5>=2
              {
               System.out.print(j);
              }
        }
     System.out.println();
  }
 
}

}

