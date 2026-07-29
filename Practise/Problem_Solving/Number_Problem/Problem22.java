class Problem22
{

    public static Boolean isPrime(int n)
    {
         Boolean b=false;
         int count=1;
         if(n<1)
         {
             b=false;
         }
         else{
         for(int i=2;i<=n;i++)
         {
             if(n%i==0)
             {
                 count++;
             }
         }
         }
         if(count<=2)
            b=true;
        return b;
     }   
 
    public static void main(String args[])
    {
           int n=725438;
           int sum=0;
           while(n!=0)
           {
              int digit=n%10;
              if(isPrime(digit))
              {
                  sum+=digit;
              }
             n/=10;
           }
        System.out.println(sum);
    }
}