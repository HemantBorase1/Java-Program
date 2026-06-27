class Problem16
{

   public static void main(String[] args)
   {
       int a=24;
       int b=36;
       
       int gcd=1;
       int n=Math.min(a,b);

       for(int i=1;i<=n;i++)
       {
             if(a%i==0 && b%i==0)
                 gcd=i;
       }
       System.out.println(gcd);
   }
}