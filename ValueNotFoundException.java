public class ValueNotFoundException extends Exception
{
    public ValueNotFoundException(String errorMessage)
    {
        super(errorMessage);
    }
    
    //we dont need a get message class because exceptions inherit the getMessage
    //method from the Throwable class so we don;t need to code it here
}