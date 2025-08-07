package Exception;

public class usepassword {
    public static void main(String[]args) throws password{
    try {	
    		String a="A12345678910";
    		
    		if(a.length()<=8) {
    			System.out.println("Password fit");
    		}
    		else {
    			throw new password("Password to length");
    		}
    }
    	catch(Exception ex) {
    		System.out.println("End");
    	}
    }
}
