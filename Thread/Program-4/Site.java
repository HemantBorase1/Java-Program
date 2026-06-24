class Site
{

   private Boolean booked=false;
   public void doReservation()
   {
        Thread t=Thread.currentThread();
        for(int i=1;i<=10;i++)
        {
                System.out.println(t.getName()+"\t Reservation Processing");
        }
      synchronized(this)
      {
           if(!booked)
           {
                for(int i=0;i<=10;i++)
                    System.out.println(t.getName()+"\t Payment Processing");
                booked=true;
                    System.out.println(t.getName()+"\t Your Ticked is Booked Successfully.");
           }
           else
               System.out.println("Sorry "+t.getName()+"\t ticket booked already");
      }
   }
}