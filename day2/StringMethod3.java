package day2;

public class StringMethod3 {
public static void main(String[]args) {
	//indexOf()
	String a="JavaPrograms";
	int b=a.indexOf("a");
	System.out.println(b);
	int b1=a.indexOf("K");
	System.out.println(b1);
	//charAt()
	char c=a.charAt(4);
	System.out.println(c);
	char d=a.charAt(0);
	System.out.println(d);
char d1=a.charAt(a.length()-1);
System.out.println(d1);
//subString
 String t=a.substring(2,7);
 System.out.println(t);
 String t1=a.substring(4);
 
}
}
