class Problem11
{

     public static void main(String[] args)
     {
          int n=846291;
          int max=1;
          int min=1;
          while(n!=0)
          {
              int digit=n%10;
              if(digit>max)
              {
                    max=digit;
              }
              if(digit<min)
              {
                    min=digit;
              }
             n/=10;
          }
          System.out.println(max-min);
     }
}