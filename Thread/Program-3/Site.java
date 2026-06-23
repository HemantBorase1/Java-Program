class Site {

    private boolean booked = false;

    synchronized public void doReservation() {
        Thread t = Thread.currentThread();

        if (!booked) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(t.getName() + "\t Reservation Processing");
                booked = true;
                System.out.println(t.getName() + "\t Your Ticket Booked Successfully.");
            }
        } else {
            System.out.println("Sorry. " + t.getName() + " ticket already booked.");
        }
    }
}