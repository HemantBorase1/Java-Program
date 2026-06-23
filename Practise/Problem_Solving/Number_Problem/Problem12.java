class Problem12
{

   public static void main(String[] args)
   {
      int n=145;
      int temp=n;
      int Sum=0;
      while(n!=0)
      {
          
          int digit=n%10;
          int product=1;
          for(int i=digit;i>=1;i--)
          {
               product*=i;
          }
         Sum+=product;
         n/=10;
      }
      if(temp==Sum)
      {
          System.out.println("Number is Strong");
      }
      else
      {
              System.out.println("Number is Not Strong.");
       }
      
   }
}