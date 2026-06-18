class Listening implements Runnable
{
    public void booklistening()
    {
           for(int i=1;i<=10;i++)
           {
              System.out.println("book Listening");
           }
    }
    public void run()
    {
          booklistening();
    }

}