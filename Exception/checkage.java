package Exception;

public class checkage {
public static void main(String[]arg) throws AgeException { 
	//try {
	int age=14;
	
	
	if (age>=18) {
		System.out.println("Eligible");
	} 
	else {
		//throw new AgeException("Not Eligible");
	System.out.println("Not Eligible");
	}
	//}
	//catch(Exception Ex) {
		//System.out.println("End");
	//}
	//System.out.println("End");
}
}
