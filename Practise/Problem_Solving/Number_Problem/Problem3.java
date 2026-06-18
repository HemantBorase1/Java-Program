class Problem3
{

    public static void main(String[] args)
    {
        int n=135;
        int temp=n;
        int rev=0;
        while(n!=0)
        {
              int digit=n%10;
              rev=rev*10+digit;
              n/=10;
        }
        if(temp==rev)
        {
              System.out.println("Digit is Palindrome");
        }
        else
        {
                 System.out.println("Digit is not Palindrome");
         }
    }
}
