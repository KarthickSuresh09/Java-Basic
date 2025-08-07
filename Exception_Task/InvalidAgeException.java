package Exception_Task;

public class InvalidAgeException extends Exception{
	public  InvalidAgeException(String age ) throws InvalidAgeException {
            super(age);
	}

}
