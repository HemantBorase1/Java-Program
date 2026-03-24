class Program59
{

public static void main(String [] args)
{
      int n=5;
      int count=n*(n+1)/2;
     for(int i=5;i>=1;i--)
     {
        int c=count;
         for(int j=1;j<=i;j++)
         {
         System.out.print((char)(c+64)+"\t");
         c--;
         }
       System.out.println();
       count-=i;
     }
}

}