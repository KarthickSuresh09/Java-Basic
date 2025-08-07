package Exception;

public class Age {
public static void main(String[]arg) {
	try {
	aru a=new aru();
	a.setAge(-10);
	}
	catch (IllegalArgumentException Ex) {
		System.out.println(Ex.getMessage());
	}
}
}
