class Problem10
{

   public static void main(String [] args)
   {
         int n=2389346;
         int count=0;
         while(n>0)
         {
             int digit=n%10;
             if(digit%2==0)
             {
                 count++;
             }
            n/=10;
          }
       System.out.println("Even Digit Present in the Number:"+count);
   }
}