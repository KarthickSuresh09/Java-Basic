package Exception;

public class ind {
public static void main(String[]args) {
	try {
		int []a= {10,20,30,40};
	System.out.println(a[4]);
	}
	catch(ArrayIndexOutOfBoundsException Exception) {
		System.out.println("error");
	}
}
}
