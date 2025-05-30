package day3;

public class TypeConversation {
public static void main (String[]args) {
	int a=Integer.parseInt(args[0]);
System.out.println(a);
float b=Float.parseFloat(args[1]);
System.out.println(b);
long c=Long.parseLong(args[2]);
System.out.println(c);
double d=Double.parseDouble(args[3]);
System.out.println(d);
char[] e=args[4].toCharArray();
System.out.println(e);
}
}
