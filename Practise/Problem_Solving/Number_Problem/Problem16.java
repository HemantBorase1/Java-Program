class Problem16
{
        
     public static Boolean isPrime(int n)
     {
         Boolean status=false;
         int count=0;
         for(int i=1;i<=n;i++)
         {
               if(n%i==0)
               {
                   count++;
               }
         }
         if(count<3)
         {
            status=true;
         }
        return status;
     }

     public static void main(String[] args)
     {
             int n=2356897;
             int count=0;
             while(n!=0)
             {
                 int digit=n%10;
                 if(isPrime(digit))
                 {
                    count++;
                 }       
                 n/=10;
             }
            System.out.println(count);
     }
}