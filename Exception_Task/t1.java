package Exception_Task;

public class t1 {

	public static void main(String[] args) {

		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException Ex) {
			System.out.println("error");
		}
		
		try{
			int[]a= {10,20,30,40};
			System.err.print(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Does'not have a value");
		}
		
		try {
			String a="Hello";
			int b=Integer.parseInt(a);
			
			System.out.println(b);
		}
		catch(NumberFormatException E1) {
			System.err.println("String cannot be convert int value");
		}
		try {
			String a="Hello";
			System.out.print(a.charAt(6));
		}
		catch (StringIndexOutOfBoundsException E2){
			System.out.println("String does't have size");

		}
		try {
			String a=null;
			System.out.println(a.length());
		}
		catch(NullPointerException e2) {
			System.out.println("String does't have any size");

		}
	}

}
