class Problem25
{

  public static void main(String[] args)
  {
        int n=135,count=0;
        int temp=n;
        int n2=n;
        
        int sum=0;
       while(n!=0)
       {
          n/=10; 
          count++;
       }
       while(n2!=0)
       {
           int digit=n%10;
           sum+=Math.pow(digit,count);
           count--;
           n/=10;
       }
      if(temp==sum)
      {
          System.out.println("Disarium Number");
      }
      else
      {
         System.out.println("Not Disarium Number");
      }
  }
}