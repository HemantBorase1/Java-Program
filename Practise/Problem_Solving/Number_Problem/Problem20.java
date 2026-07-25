class Problem20
{

     public static void main(String[] args)
     {
          int n=5832469;
          int large1=3;
          int large2=2;
          int large3=1;
          while(n!=0)
          {
               int digit=n%10;
               if(large1<digit)
               {
                    large2=large1;
                    large1=digit;
               }else if(digit > large2 && digit!=large1)
               {
                    large3=large2;
                    large2=digit;
               }     
               else if(digit > large3 && digit!=large2)
               {
                    large3=digit;
                }
             n/=10;
          }
          System.out.println("Max:"+large1);
          System.out.println("SecondMax:"+large2);
          System.out.println("ThirdMax:"+large3);
     }
}