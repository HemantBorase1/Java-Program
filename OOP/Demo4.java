class Demo4
{

    Boolean checkStrong(int n)
    {
         int temp=n;
         int sum=0;
         while(temp!=0)
         {
            int fact=1;
           for(int i=1;i<=temp%10;i++)
           {
             fact*=i;
             sum+=fact;     // Working is not Proper See the issue
             temp/=10;
           }
         }
        return sum==n;
    }
   Boolean checkArmStrong(int n)
   {
           int temp=n;
           int power=0,sum=0;
           while(temp!=0)
           {
             power++;
             temp/=10;
           }
          temp=n;
         while(temp!=0)
         {
            sum+=Math.pow(temp%10,power);
             temp/=10;
         }
      return sum==n;
   }
  
   
  Boolean checkPerfectSquare(int n)
  {
    boolean b=false;
      for(int i=1;i<=n/2;i++)
      {
              if(i*i==n)
              {
              b=true;
              break;
              }
        
      }
    return b;
  }
 
  Boolean checkPerfectCube(int n)
  {
       boolean b=false;
       if(n==0||n==1)
       {
               b=true;
        }
       else
       {
              for(int i=1;i<=n/2;i++)
              {
                   if(i*i*i==n)
                   {
                     b=true;
                     break;
                   }
              }
       }
     return b;
  }
 
   boolean checkPrime(int n)
   {
       boolean b=false;
       if(n==0||n==1)
       {
           b=true;
       }
       else
       {
              for(int i=2;i<=Math.sqrt(n);i++)
              {
                   if(n%i==0)
                   {
                     b=true;
                     break;
                   }
              }
       }
      return !b;
   }
   
   

  boolean checkPrimeAndTwist(int n)
  {
     if(checkPrime(n))
          if(checkPrime(reverseNumber(n)))
              return true;
     return false;
  }

  int reverseNumber(int n)
  {
        int sum=0;
        while(n!=0)
        {
           sum*=10;
           sum+=n%10;
           n/=10;

        }
     return sum;
  }
   
  int reverseDigit(int n)
  {
         int sum=0;
         while(n!=0)
         {
           sum+=n%10;
            n/=10;
           if (n != 0)   
            sum *= 10;
         }
      return sum;
  }

  boolean checkPalindrom(int n)
  {
          int temp=n;
          boolean b=false;
          if(reverseDigit(temp)==n)
          {
             b=true;
          }
       return b;
  }
  
    int findNthArmStrong(int last)
  {
            int count=0,a=0;
            while(true)
            {
              if(checkArmStrong(a))
                  count++;
              if(count==last)
                   break;
            a++;
            }
        return a;
  }

  boolean findNthPalindromicPrime(int n)
 {
     int count=0,a=0;
     while(true)
     {
          if(checkPalindrom(n))
              if(checkPrime(n))
                 return true;
        return false;
     }
 }

 int addNum(int n)
 {
     int sum=0;
    while(n>0)
    {
       int digit=n%10;
       sum+=digit;
       n/=10;
    }
   return sum;
 }


boolean checkNumContainSum(int n)
{
        boolean b=false;
        int sum=addNum(n);
        int count=0;
        int a=0;
       while(sum!=0)
       {
           int digit=sum%10;
           sum/=10;
           count++;
       }
      if(count>=3)
      {
           a=n%1000;
      }
      else if(count>=2)
      {
           a=n%100;
      }
      else
      {
           a=n%10;
      }
     while(n>0)
     {
         int temp=n%a;
         if(temp==sum)
         {
            b=true;
            break;
         }
       n/=a;
     }
  return b;
} 

   
}