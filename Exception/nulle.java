package Exception;

public class nulle {

	public static void main(String[] args) {
           try {
        	   String a=null;
        	   a.toUpperCase();
        	   
           }
           catch(NullPointerException Exception) {
        	   System.out.println("Error");
           }
	}

}
