package Exception;

public class stringe {
public static void main(String[]args) {
	try {
		String a="hello";
		char b=a.charAt(12);
		System.out.println(b);
	}
	catch(StringIndexOutOfBoundsException Exception) {
		System.out.println("error");
	}
}
}
