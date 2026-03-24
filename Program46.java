class Program46{

  public static void main(String[] args)
 {
     int n=5;
     int count=n*(n-1)/2+1;
    for(int i=1;i<=5;i++)
   {
       int c=count;
       for(int j=1;j<i;j++)
       {
        System.out.print("\t");
       }
       for(int j=n;j>=i;j--)
       {
        System.out.print(c+"\t");
       c-=j-1;
       } 
    System.out.println();
     count++;
   }
 }

}