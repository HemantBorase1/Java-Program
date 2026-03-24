class Program49{

public static void main(String[] args)
{
    
    int n=5;
    int count=n*(n+1)/2;
    for(int i=1;i<=n;i++)
    {
      int c=count; // 15 
         for(int j=i;j>1;j--)
         {
          System.out.print("\t");
         }
         for(int j=i;j<=n;j++)
         {
          System.out.print(c+"\t");
          c-=j+1; // 15-1+1
         }
        System.out.println();
        count-=i;
    }
}

}

