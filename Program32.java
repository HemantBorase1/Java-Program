class Program32{

// c for column
// count for row
public static void main(String [] args)
 {
   int n=5;
   int count=1; //1
   for(int i=1;i<=n;i++)  // 3<=5
   {
     int c=count; // 3
      for(int j=i;j<n;j++) // 5<5 false
      {
        System.out.print("\t");
      }
      for(int j=i;j>=1;j--) // 1>=1
      {
        System.out.print(c+"\t"); // 2
        c++;// 1+1=2 2+1
      }
   System.out.println();
  count+=i; // 1-1+1=1 3-3+1
   }
 }

}
/*
_ _ _ _ 1
_ _ _ 2 3

*/