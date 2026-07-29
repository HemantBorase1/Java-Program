class Problem23
{

    public static Boolean isEven(int n)
    {
          Boolean b=false;
          if(n%2==0)
              b=true;
         return b;
    } 
 
     public static void main(String[] args)
     {
       int n=5738269;
       int large=4;
       while(n!=0)
       {
           int digit=n%10;
           if(isEven(digit))
           {
              if(digit>large)
                 large=digit;
           }
          n/=10;
       }
      System.out.println(large);
     }
}