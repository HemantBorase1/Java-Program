public class Main
{

   public static void main(String[] args)
   {
           try{
                Voter.checkAge(18);
           }
           catch(InvalidAgeException e)
           {

                 System.out.println("Exception:"+e.getMessage());
           }
   }
}