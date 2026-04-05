class Demo
{

     int avgOfDigit(int n)
     {
        int sum=0;
        int count=0;
        int avg=1;
         while(n>0)
        {
         sum+=n%10;
         n/=10;
         count++;
         avg=sum/count;
        }
      return avg;
     }

    int findMaxDigit(int n)
    {
           int max=0;
          while(n>0)
          {
           int digit =n%10;
           if(digit>max)
           {
            max=digit;
           }
           n/=10;
          }
      return max;
    }
   
  int findMinDigit(int n)
  {
         int min=9;
         while(n>0)
        {
            int digit=n%10;
            if(digit<min)
            {
             min=digit;
            }
          n/=10;
        }
     return min;
  }

}