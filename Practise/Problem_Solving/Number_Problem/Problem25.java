class Problem25
{

      public static int Numpower(int count,int digit)
      {
                  int ans=1;
                  while(count!=0)
                  {
                     ans*=digit;
                     count--;
                  }
                  return ans;      
           }

      public static void main(String[] args)
      {
           int n=135;
           int temp=n;
           int rev=0;
           int count=0;
           int ans=0; 
         
           while(n!=0)
           {
                rev=(rev*10)+(n%10);
                n/=10;
           }
           while(rev!=0)
           {
               count++;
               int digit=rev%10;
               ans+=Numpower(count,digit);
               rev/=10;
            }
           System.out.println(n);
           if(ans==temp)
           {
              System.out.println("Disarium Number");
           }
           else
           {
               System.out.println("Not Disarium Number");
           }
           
      }
}