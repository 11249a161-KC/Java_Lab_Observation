class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class eligiblevoter 
{
    public static void validateAge(int age) throws InvalidAgeException 
    {
        if (age < 18)
        {
            throw new InvalidAgeException("Sorry, you must be atleast 18 years old to vote");
        }
        else
        {
            System.out.println("Welcome to our voting environment");
        }
    }
    
    public static void main(String[] args) 
    {
        int[] voterAges = {16,25};
        
        for(int age : voterAges)
        {
            System.out.println("Checking eligibilty for age " + age + ":");
            try
            {
                validateAge(age);
            }
            catch(InvalidAgeException e)
            {
                System.out.println("WARNING!: " +e.getMessage());
            }
        }
    }
}
