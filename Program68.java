class Program68
{
  public static void main(String [] args)
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
        for(int j=5;j>=1;j--)
        {
           if(i<j) // 5<5             //ttttf
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