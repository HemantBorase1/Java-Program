class Problem7
{

     public static void main(String[] args)
     {
           int n=583246;
           int sum=0;
           while(n!=0)
           {
                 int digit=n%10;
                 if(digit%2==0)
                 {
                      sum+=digit;
                 }
                 n/=10;
           }
          System.out.println(sum);
     }
}