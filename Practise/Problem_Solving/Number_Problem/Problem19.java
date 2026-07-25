class Problem19
{

      public static void main(String[] args)
      {
           int n=5832469;
           int f=5;
           int count=0;
           while(n!=0)
           {
                 int digit=n%10;
                 if(digit>f)
                 {
                    count++;
                 }
                 n/=10;
           }
           System.out.println(count);
      }
}