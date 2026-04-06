class MainClass
{

    public static void main(String[] args)
    {
        /* Demo d1=new Demo();
           int ans=d1.avgOfDigit(23415);
           System.out.println("Average of Number:"+ans);

          System.out.println("Find Max Value:"+d1.findMaxDigit(78124));
          System.out.println("Find Min Value:"+d1.findMinDigit(32457));
       */
       Demo2 d1=new Demo2();
       System.out.println("Shift at First:"+d1.shiftAtFirst(57849));
       
       System.out.println("\nAppend Two Number at First:"+d1.appendTwoDigit(55,1234));
       System.out.println("\nReverse of a Number:"+d1.reverseNumber(7849));
           
    }
}