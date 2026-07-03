class Problem24
{
    public static void main(String args[])
    {
          int n=9586;
          int max=1;
          int secondmax=0;
          while(n!=0)
          {
               int digit=n%10;
               if(digit>max)
               {
                   secondmax=max;
                   max=digit;
                   
               }
              n/=10;
          }
        System.out.println(secondmax);
    }
}