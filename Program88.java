class Program88
{

 public static void main(String[] args)
  {
        int n=5;
       for(int i=1;i<=n;i++)   // 2<=5
       {
             for(int j=i;j<n;j++) // 2<5
             {
             System.out.print("_");
             }
             for(int j=i;j>i;j--) // 2>1
             {
             System.out.print(j);
             }
             for(int j=i;j>=1;j--) //1>=1
             {
             System.out.print(j);
             }
        System.out.println();
       }
  }

}