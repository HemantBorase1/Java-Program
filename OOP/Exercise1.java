class Exercise1
{

    public static void main(String[] args)
    {
          Methods1 m1=new Methods1();
          int count1=1,count2=1;
         for(int i=1;i<=10000;i++)
         {
             
               if(m1.checkPalindrome(i))
               {
                   count1++;
                   if(count1==120)
                      System.out.println("100th Palindrome Number: "+i);
               }
           
         }
        System.out.println("Total Palindrome Numbers: "+count1);

         for(int i=1;i<=1000;i++)
         {
               if(m1.checkPrime(i))
               {
                  count2++;
                  if(count2==100)
                      System.out.println("120th PrimeNumber: "+i);
               }
           

         }
       System.out.println("Total Prime Number:"+count2);
       
    }
}

/*
100th Palindrome Number: 2002
Total Palindrome Numbers: 199
120th PrimeNumber: 523
Total Prime Number:1230

*/