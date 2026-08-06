class Problem29
{

     public static int fact(int n){
         int prod=1;
         while(n!=0)
         {
               prod=prod*n;
               n--;
         }
        return prod;
     }
     public static void main(String[] args)
     {
           int sum=0;
           int n=145;
           int temp=n;
           while(n!=0)
           {
               int digit=n%10;
               sum+=fact(digit);
               n/=10;
           }
        if(sum==temp)
        {
             System.out.println("Peterson Number");
        }
        else
        {
              System.out.println("Not Peterson Number");
        }
     }
}