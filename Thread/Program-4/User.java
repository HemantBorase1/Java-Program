class User implements Runnable
{

    private Site s=null;
    User(Site s)
    {
       this.s=s;
    }
   User()
   {}
    public void run()
    {
      s.doReservation();
    }
}