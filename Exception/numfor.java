package Exception;

public class numfor {
public static void main(String[]args) {
	try {
		String a="hello";
		int b=Integer.parseInt(a);
		System.out.println(a);
	}
	catch (NumberFormatException Exception) {
		System.out.println("Error");
	}
}
}
