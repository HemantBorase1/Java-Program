class Problem17
{

    public static void main(String[] args)
    {
        int n=69;
      
        boolean b=false;
        int count=0;       
        double root=Math.sqrt(n);
        int temp=root;
        while(temp!=0)
        {
           int digit=temp%10;
           count++;
           n/=10;
        }
        while(n!=0)
        {
         if(count==1)
         {
          int digit =n%10;
          if(digit==temp)
          {
               b=true;
               break;
          }
          else
          {
               b=false;
          }
         }
         if(count==2)
         {
            int digit =n%100;
          if(digit==temp)
          {
               b=true;
               break;
          }
          else
          {
               b=false;
          }
         }
         n/=10;
         
        }

        if(b)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
    }
}