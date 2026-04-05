class Program130
{
   public static void main(String[] args)
   {
     int n=5;
     for(int i=n;i>=1;i--)
     {
           for(int j=1;j<=i;j++)
           {
            System.out.print(j);
           }
           for(int j=i;j<=5;j++)
           {
            System.out.print(i);
           }
       System.out.println();
     }
   }
}
/*
11111
12222
12333
12344
12345

*/