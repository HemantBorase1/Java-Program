class Program54{

public static void main(String[] args)
{
  int n=5;
  int count1=n;
  int count2=n*(n+1)/2;
  for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
  {
   int c1=count1;
   int c2=count2;
    for(int j=1;j<i;j++)
      {
      System.out.print("\t");
      }
    for(int j=i,j1=1;j<=5||j1<=i1;j++,j1++)
      {
      System.out.print((char)(c1+96));
      System.out.print((char)(c2+96)+"\t");
      c1-=j+1;
      c2+=j;
      }
     System.out.println();
     count1+=i-1;
     count2-=i;
   }

}

}