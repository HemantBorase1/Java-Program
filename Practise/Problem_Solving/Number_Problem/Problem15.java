class Problem15
{

    public static void main(String[] args)
    {
          int n=18;
          int temp=n;
          int sum=0;
         while(n!=0)
         {
               int digit=n%10;
               sum+=digit;
               n/=10;
         }
        if(temp%sum==0)
        {
                System.out.println("Harshad (Niven) Number");
        }
        else
        {
                 System.out.println("Not Harshad (Niven) Number");
        }
    }
}