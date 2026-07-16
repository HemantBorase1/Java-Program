class Problem8
{

     public static void main(String[] args)
     {
           int n=458923;
           int n2=n;
           int count=0;
           int last=0;
           while(n!=0)
           {
                count++;
                n/=10;
           }
           while(n2!=0){
               int digit=n2%10;
               if(count==1)
               {
                    last=digit;
                    break; 
               }
               count--;
               n2/=10;
           }
         System.out.println(last);
     }
}