class Writing extends Thread
{
    public void bookWriting()
    {
           for(int i=1;i<=10;i++)
           {
              System.out.println("bookWriting");
           }
    }
    public void run()
    {
          bookWriting();
    }

}