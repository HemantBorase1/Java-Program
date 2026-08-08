class Problem30
{

     public static void main(String[] args){
         
        int n=583246;
        int rev=0;
        int sum=0;
        while(n!=0)
        {
           int digit=n%10;
           rev=(rev*10)+digit;
           n/=10;
        }
        int count=1;
        while(rev!=0)
        {
           int digit=rev%10;
           if(count%2!=0)
           {
               sum+=digit;
           }
           count++;
           rev/=10;
        }
       System.out.println(sum);
        
    }
}