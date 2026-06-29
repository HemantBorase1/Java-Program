class Problem18
{

    public static void main(String[] args)
    {
         int n1=12;
         int n2=18;
         int max=Math.max(n1,n2);
       
         for(int i=1;i<=max;i++)
         {
              int number=max*i;
              if(number%n1==0 && number%n2==0)
              {
                System.out.println("LCM is Found:"+number);
                break;
              }
              
         }
    }
}