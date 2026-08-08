class Problem32
{
     public static Boolean isPrime(int n)
     {
          Boolean b=false;
          if(n>1)
          {
               int count=1;
               for(int i=2;i<=n;i++)
               {
                    if(n%i==0)
                    {
                        count++;
                    }
                }
             if(count>=2)
             {
                 b=true;
             }
          }
         return b;
     }

     public static void main(String[] args)
     {
           int n=13; 
           int rev=0;
           if(isPrime(n))
           {
                while(n!=0)
                {
                    rev=rev*10+(n%10);
                    n/=10;
                }
           }
          
           if(isPrime(rev)){
             System.out.println("Circular Prime");
           }
          else{
               System.out.println("Not Circular Prime"+rev);
          }
     }
}