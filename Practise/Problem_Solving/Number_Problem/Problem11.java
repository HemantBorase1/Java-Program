class Problem11
{

   public static void main(String[] args)
   {
        int n=76392495;
        int count=0;
        while(n!=0)
        {
              int digit = n%10;
              if(digit%2!=0)
              {
                   count++;
              }
              n/=10;
        }
       System.out.println(count);
   }
}