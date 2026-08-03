class Problem26
{

      public static void main(String[] args)
      {
            int n=9637258;
            int count=0;
            while(n!=0)
            {
               int digit=n%10;
               if(digit%3==0)
               {
                    count++;
               }
               n/=10;
            }
           System.out.println(count);
      }
}