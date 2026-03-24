class Program25{

 public static void main(String [] args)
{
     int n=5;
     int count=n*(n-1)/2+1;  // 11
    for(int i=n;i>=1;i--)   // 4 >=1
     {
      int c=count; // 7
           for(int j=1;j<=i;j++) // 1)6<=5 false 2)5<=4 false
           {
            System.out.print(c+"\t");  // 1) 11 12 13 14 15   2) 7 8 9 10   3)
            c++; // 10
            } 
        System.out.println();
        count-=i-1; // 7-4-1=4

     }
}

}