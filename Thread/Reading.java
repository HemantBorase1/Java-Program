class Reading implements Runnable
{
    public void bookReading()
    {
           for(int i=1;i<=10;i++)
           {
              System.out.println("book Reading");
           }
    }
    public void run()
    {
          bookReading();
    }

}