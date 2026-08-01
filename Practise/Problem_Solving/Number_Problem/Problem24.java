class Problem24
{

    public static int powerr(int n,int count)
    {
          int sum=0;
          while(count!=0)
          {
               sum+=(n*count);
               count--;
          }
       return sum;
    }
    public static void main(String[] args)
    {
        int n=135;
        int sum=0;
        int rev=0;
        int count=1;
        while(n!=0)
        {
            int digit=n%10;
            rev=(rev*10+digit);
            n/=10;
        }
        while(rev!=0)
        {
            int digit=rev%10;
            count++;
            sum+=powerr(digit,count);
            rev/=10;
        }
       if(sum==n)
       {
        System.out.println("Disarium Number");       
  }
    }
}