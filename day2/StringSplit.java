package day2;

public class StringSplit {
public static void main(String[]args) {
	String a="Hello,World";
	String[]a1=a.split(",");
	System.out.println(a1[0]);
	System.out.println(a1[1]);
	System.out.println(a1.length);
	String k="HONDA";
	String[]a2=k.split("N");
	System.out.println(a2[0]);
}
}
