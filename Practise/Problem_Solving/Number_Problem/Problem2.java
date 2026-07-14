class Problem2
{

     public static void main(String[] args)
     {
           int n=121;
           int temp=n;
           int rev=0;
           while(n!=0){
                int digit=n%10;
                rev=rev*10+digit;
                n/=10;
           }
           if(rev==temp){
               System.out.println("Number is Palindrome.");
           }
           else
           {
                 System.out.println("Number is Not Palindrome.");
           }
     }
}