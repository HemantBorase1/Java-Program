class Demo2
{

    int shiftAtFirst(int n)
    {
         int last=n%10;
         n/=10;
         int temp=n;
         while(temp!=0)
         {
           last*=10;
           temp/=10;
         }
       return last+n;
    }

   int appendTwoDigit(int n1,int n2)
   {
            int first=n1;
            int temp=n2;
            while(temp!=0)
            {
             first*=10;
             temp/=10;
            }
         return first+n2;
   }
   

   int reverseNumber(int n)
   {
               int rev=0;
            while(n>0)
            {
              int digit=n%10;
              rev=rev*10+digit;
              n/=10;
            }
          return rev;
   }

   
}