class Problem1
{

    public static void main(String args[]){
         int n=5824;
         int sum=0;
         while(n!=0){
             int digit=n%10;
             sum+=digit;
             n/=10;
        }
      System.out.println(sum);
    }
}