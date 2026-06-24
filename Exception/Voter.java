public class Voter
{
    public static void checkAge(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            throw new InvalidAgeException("You are not Eligible to Vote.");
        }

        System.out.println("You Are Eligible for Vote");
    }
}