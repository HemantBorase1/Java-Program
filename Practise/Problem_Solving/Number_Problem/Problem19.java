class Problem19
{

    public static void main(String[] args)
    {
           int n=512974;
           
           int min=9;
           while(n!=0)
           {
                 int digit=n%10;
                 if(digit<min)
                 {
                    min=digit;  
                 }
                n/=10;
           }
          System.out.println("Smallest Digit:"+min);
    }
}