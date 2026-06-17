class Program1
{

 public static void doStuff();
 {
        doMoreStuff();
       System.out.println("dostuff Method");
 
  }
  public static void doMoreStuff()
  {
      System.out.println("Its an doMoreStuff Method Called.");
  }
   public static void main(String[] args)
   {
          doStuff();
         System.out.println(10/0);
  
    }
}