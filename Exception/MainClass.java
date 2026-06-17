class MainClass
{

   public static void doStuff()
   {
         domoreStuff();
   }
   public static void domoreStuff()
   {
            System.out.println("Hello");
            System.out.println(10/0);
    }
 public static void main(String[] args)
 {
       doStuff();
 }
}