class Methods1
{
      
    Boolean checkPalindrome(int n)
    {
         int temp=n;
         int sum=0;
         while(temp!=0)
         {
            sum*=10;
            sum+=temp%10;
            temp/=10;
         }
       return sum==n;
    }

    Boolean checkPrime(int n)
    {
            boolean b=false;
           if(n==0||n==1)
              b=true;
           else
           {
                  for(int i=2;i<=Math.sqrt(n);i++)
                      if(n%i==0)
                      {
                        b=true;
                        break;
                      }
              
           }
         return !b;
    }

}