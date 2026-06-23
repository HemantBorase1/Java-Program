class Program9
{

     public static void main(String[] args) throws InterruptedException
     {
            m1();
     }
     public static void m1() throws InterruptedException
     {
            m2();
     }
     public static void m2() throws InterruptedException
     {
           Thread.sleep(1000);
           System.out.println("m1 Method is Executed after 1 sec.");
     }
}

/*
1. m2() Handover the Exception to their Parent Method(Where the Method Should be Called.)
2. m1() Handover the Exception to the Main Method.
3. main() method is Handover the Exception to JVM Directly So The JVM Will Handle the Checked Exception.

*/