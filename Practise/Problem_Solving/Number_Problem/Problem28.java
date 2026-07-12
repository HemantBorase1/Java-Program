class Problem28
{

     public static void main(String[] args)
     {
           int n=145;
           int temp=n;
           int prod;
           int sum=0;
          while(n!=0)
          {
             int digit=n%10;
             prod=1;
             while(digit!=0)
             {
                prod*=digit;
                digit--;
             }
            sum+=prod;
            n/=10;
          
          }
         if(temp==sum)
         {
              System.out.println("Peterson Number.");
         }
         else
         {
              System.out.println("Not Peterson Number.");
          }
      }
}