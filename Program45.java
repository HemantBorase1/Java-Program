class Program45{

public static void main(String [] args)
{
      int n=5;
      int count=n; // 5
     for(int i=1;i<=n;i++) // 1<=5
     {
      int c=count;// 5
       for(int j=i;j>1;j--) // 1>1 
       {
        System.out.print("\t");
       }
       for(int j=n;j>=i;j--) // 2>1 
       {
        System.out.print(c+"\t"); // 5 9 12 14
        c+=j-1; // 5+5-1=9 9+4-1=12 12+3-1=14  14+2-1=15
       }
     System.out.println();
     count--;
     }

}
}