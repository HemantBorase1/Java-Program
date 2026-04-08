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

   
}