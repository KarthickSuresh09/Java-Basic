package Exception;

public class ar1 {
	public static void main(String[]args) {
System.out.println("Start");
try {
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println(c);
}
catch(ArithmeticException Exception) {
	System.err.println("Error Occur");
}
System.err.println("End");
}
}
