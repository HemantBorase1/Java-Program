class Problem17
{

     public static void main(String[] args)
     {
         int n=987978;
         int Max=3;
         int SecondMax=2;
         while(n!=0)
         {
             int digit=n%10;
             if(digit>Max)
             {
                Max=digit;
                SecondMax=Max;
                n/=10;
             }else if(digit<Max )
             {
                 SecondMax=digit;
                 n/=10;
             }
             else
             {
                 n/=10;
             }
         }
         System.out.println("Max:"+Max+"\t"+"Second Max:"+SecondMax);
     }
}