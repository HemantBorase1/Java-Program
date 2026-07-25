class Problem21
{
     public static void main(String[] args)
     {
         int n=123;
         int sum=0;
         int prod=1;
         while(n!=0)
         {
             int digit=n%10;
             prod=prod*digit;
             sum+=digit;
             n/=10;
         }         
        if(sum==prod)
        {
            System.out.println("Syp Number");
        }     
        else
        {
            System.out.println("Not Spy Number");
        }
     }
}