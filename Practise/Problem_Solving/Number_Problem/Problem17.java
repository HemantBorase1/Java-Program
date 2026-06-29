class Problem17
{
   // Dry-Run this Program
    public static void main(String[] args)
    {
        int n=625;
        int square=n*n;
       
        int temp=n;
        int count=0;
        
        // it counts digits in number.
        while(temp>0)
        {
             count++;
             temp/=10;
        }   
        // power of 10 based in digit count    
        int power=1;
        for(int i=0;i<count;i++)
        {
              power*=10;
        }
        // extract last digits of square

        int lastDigits = square % power;
  
        // check condition
        if(lastDigits==n)
        {
            System.out.println("Antomorphic Number");
        }
        else
        {
             System.out.println("Not Automorphic Number");
        }
    }
}