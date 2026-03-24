class Program51{

public static void main(String[] args)
{
   int n=5;
   int count1=1;
   int count2=n*(n+1)/2;
   for(int i=5;i>=1;i--)
   {
       int c1=count1;
       int c2=count2;
       for(int j=1;j<=i;j++)
       {
        System.out.print((char)(c1+96));
        System.out.print((char)(c2+96)+"\t");
        c1++;
        c2--;
       }
     System.out.println();
    count1+=i;
    count2-=i;

   }
}

}