class Problem31
{
 
     public static Boolean isPrime(int n){
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
           if(count<=2)
           { b=true; }
        }
        
        return b;
     } 
 
     public static void main(String[] args)
     {
         int n=894527;
         int min=5;
         while(n!=0)
         {
               int digit=n%10;
               if(isPrime(digit))
               {
                   if(digit<min)
                   {
                        min=digit;
                   }
               }
               n/=10;
         }
         System.out.println(min);
     }
}