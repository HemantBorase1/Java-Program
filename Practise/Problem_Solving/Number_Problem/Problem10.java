class Problem10
{
 
    public static void main(String[] args)
    {
             int n=596782;
             int count=0;
           while(n!=0)
           {
                int digit=n%10;
                if(digit>5)
                {
                    count++;
                }
                n/=10;
           }
           System.out.println(count);
     }
}