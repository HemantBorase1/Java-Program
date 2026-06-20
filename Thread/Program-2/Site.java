class Site
{
      public void doReservation()
      {
         Thread t=new Thread.currentThread();
         for(int i=1;i<=10;i++)
         {
              System.out.println("\t Reservation Processing.");
          }
      }
}