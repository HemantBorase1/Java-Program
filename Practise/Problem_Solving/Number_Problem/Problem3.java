class Problem3
{

     public static void main(String[] args)
     {
           int n=572981;
           int max=1;
           while(n!=0){
              int digit=n%10;
              if(digit>max){
                 max=digit;
              }
              n/=10;
           }
           System.out.println(max);
     }
}