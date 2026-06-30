class Problem20
{

    public static void main(String[] args)
    {
         int n=9;
         int square=n*n;
         int sum=0;
         while(square!=0)
         {
              int digit=square%10;
              sum+=digit;
              square/=10;
         }

         if(n==sum)
         {
               System.out.println("Number is Neon Number");
         }
         else
         {
              System.out.println("Not Neon Number");
         }
    }
}