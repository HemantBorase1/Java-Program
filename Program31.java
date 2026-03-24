class Program31{

public static void main(String [] args)
 {
/*
                                15
                        13      14
                10      11      12
        6       7       8       9
1       2       3       4       5
*/
   int n=5;
   int count=n*(n+1)/2;   // 15
    for(int i=1;i<=n;i++)   // 2<=5
    {
          int c=count; // 13
          for(int j=i;j<5;j++) // 2<5 false
          {
          System.out.print("\t");
          }
          for(int j=i;j>=1;j--) // 1>=1  
          {
           System.out.print(c+"\t"); 
           c++; // 1
          }
      System.out.println();
      count-=i+1; // 13
    }
 
 }

}

/*
Dry Run:
_ _ _ _  15
_ _ _ 13 14


*/