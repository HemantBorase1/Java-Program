class Problem28
{

     public static void main(String[] args)
     {
          int n=483726;
          int n2=n;
          int sum=0;
          int count=0;
          while(n!=0)
          {
             sum+=(n%10);
             n/=10;
             count++;  
          }
          int avg=sum/count;
          count=0;
          while(n2!=0)
          {
              int digit=n2%10;
              if(digit>avg)
              {
                  count++; 
              }
              n2/=10;
          }
          System.out.println(count);
     }
}