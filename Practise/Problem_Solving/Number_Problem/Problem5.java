class Problem5
{

     public static void main(String[] args)
     {
          int n=145;
          int temp=n;
          int sum=0;
          while(n!=0)
          {
               int prod=1;
               int digit=n%10;
               if(digit!=0){
                   prod*=digit;
                   digit--;
               }
              sum+=prod;
           n/=10;
          }
         if(temp==sum)
         {
              System.out.println("Strong Number.");
         }
         else{
            System.out.println("Not Strong Number.");
         }
     }
}