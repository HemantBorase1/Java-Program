class Site
{

   private static int booked=0;
   public static synchronized void doReservation()
   {
       Thread t=Thread.currentThread();
       if(booked<2)
       {
                   for(int i=1;i<=10;i++)
                   {
                     System.out.println(t.getName()+"\t Reservation Processing");
                    }
                  booked++;
                  System.out.println(t.getName()+"\t your ticket is booked Successfully");
       }
       else
       {
             System.out.println("Sorry "+t.getName()+" ticket booked already.");
        }
   }
}