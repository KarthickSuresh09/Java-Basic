package day2;

public class spli {
public static void main(String[]args) {
	String a="OneSoft";
	boolean b=a.equals("OneSoft");
	System.out.println(b);
	boolean b1=a.equals(a);
	System.out.println(b1);
	boolean c=a.equalsIgnoreCase(a);
System.out.println(c);
boolean t=a.startsWith(a);
System.out.println(t);
boolean k=a.endsWith(a);
System.out.println(k);
boolean f=a.contains(a); //it will check charcter or string "g" upper or lower
System.out.println(f);
}
}
