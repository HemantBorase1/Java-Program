class Problem6
{

     public static void main(String[] args)
     {
            int n=965214;
            int min=2;
            while(n!=0)
            {
                  int digit=n%10;
                  if(digit<min)
                  {
                      min=digit;
                  }
                 n/=10;
            }
           System.out.println(min);
     }
}