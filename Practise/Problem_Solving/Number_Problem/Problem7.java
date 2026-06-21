class Problem7
{

    public static void main(String[] args)
    {
         int n=153;
         int temp=n;
         int cubeadd=0;
         while(n!=0)
         {
            int digit=n%10;
            int cube=digit*digit*digit;
            cubeadd+=cube;
            n/=10;
         }

         if(cubeadd==temp)
         {
               System.out.println("Number is Armstrong.");
         }
         else
         {
              System.out.println("Number is Not Armstrong");
         }
    }
}