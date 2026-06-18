class Listening extends Thread
{
    public void booklistening()
    {
           for(int i=1;i<=10;i++)
           {
              System.out.println("bookWriting");
           }
    }
    public void run()
    {
          booklistening();
    }

}