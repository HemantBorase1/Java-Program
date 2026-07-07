class Problem26
{

      public static void main(String[] args)
      {
            int n=5829746;
            int max=1;
            while(n!=0)
            {
                 int digit=n%10;
                 if(!(digit%2==0))
                 {
                    if(digit>max)
                    {
                        max=digit;
                    }
                   
                 }
                n/=10;
                
            }
           System.out.println(max);
      }
}