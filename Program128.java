class Program128
{

  public static void main(String[] args)
  {
        int n=5;
        int count=1;
        int count2=15;
      for(int i=1;i<=n;i++)
      {
          int c=count;
          int c2=count2;
          for(int j=i;j>1;j--)
          {
           System.out.print("\t");
          }
          for(int j=n,j1=i;j>=i||j1<=n;j--,j1++)
          {
           System.out.print((char)(c+64));
           System.out.print((char)(c2+64)+"\t");
           c+=j;
           c2-=j1+1;
          }
        System.out.println();
      count++;
      count2-=i;
      }
  }
}



/*
15  13  10  6  1 
    14  11  7  2
        12  8  3
            9  4
               5
*/