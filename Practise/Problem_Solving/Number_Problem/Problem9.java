class Problem9
{

   public static void main(String [] args)
   {
       int n=12;
       boolean b=true;
       if(n<2)
       {
            b=false;
       }
       else{
             for(int i=2;i<n;i++)
             {
                  if(n%i==0)
                  {
                   b=false;
                   break;
                  }
             }
       }
       if(b)
       {
            System.out.println("Number is Prime");
       }
       else
       {
              System.out.println("Number is Not Prime");
       }
   }
}