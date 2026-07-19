class Problem14
{

     public static void main(String[] args)
     {
           int n=8269714;
           int odd=3;
           while(n!=0)
           {
                int digit=n%10;
                if(!(digit%2==0))
                {
                      if(digit>odd)
                      {
                            odd=digit;
                      }
                }
               n/=10;
           }
          System.out.println(odd);
     }
}