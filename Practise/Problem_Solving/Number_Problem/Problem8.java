class Problem8
{

    public static void main(String[] args)
    {
          int n=1956;
          int max=0;
          while(n!=0)
          {
                 int digit=n%10;
                 if(digit>max)
                 {
                    max=digit;
                 }
                n/=10;
           }
         System.out.println("Max Digit in the Number:"+max);
    }
}