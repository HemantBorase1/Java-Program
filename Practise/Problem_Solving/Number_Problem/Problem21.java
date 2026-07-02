class Problem21
{

    public static void main(String[] args)
    {
        int n=1204;
        Boolean b=false;
        while(n!=0)
        {
           int digit=n%10;
           if(digit==0)
           {
              b=true;
              break;
           }
           n/=10;
        }
        if(b)
        {
            System.out.println("Duck Number");
        }
        else
        {
             System.out.println("Not Duck Number");
        }
    }
}