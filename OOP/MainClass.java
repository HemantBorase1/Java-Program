class MainClass
{

    public static void main(String[] args)
    {
           Demo d1=new Demo();
           int ans=d1.avgOfDigit(23415);
           System.out.println("Average of Number:"+ans);

          System.out.println("Find Max Value:"+d1.findMaxDigit(78124));
          System.out.println("Find Min Value:"+d1.findMinDigit(32457));
    }
}